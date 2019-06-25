package com.gu.chatroom.services.impl;

import cn.hutool.core.util.RandomUtil;
import com.gu.chatroom.dao.UsersMapper;
import com.gu.chatroom.model.Users;
import com.gu.chatroom.services.UserServices;
import com.gu.chatroom.tools.GuTool;
import com.gu.chatroom.vo.LoginMessage;
import com.gu.chatroom.vo.RegisterForm;
import com.gu.chatroom.vo.RegisterMessage;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @className: com.gu.chatroom.services.impl.UserImpl
 * @description: UserImpl - TODO
 * @version: v1.0.0
 * @date: 2019/6/14 10:26
 * @author: haoduor
 */
@Service
public class UserImpl implements UserServices {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public Users getUserbyid(int id) {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public Users getUserByName(String username) {
        return usersMapper.selectByUsername(username);
    }

    @Override
    public LoginMessage userLogin(String username, String password, String code) {
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            Session session = currentUser.getSession();

            code = code.toLowerCase();

            Object dbcode;
            if ((dbcode = session.getAttribute("code")) != null) {
                if(! code.equals(dbcode.toString())) {
                    return LoginMessage.WrongCaptchaCode();
                }
            }

            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            try {
                currentUser.login(token);
            }
            catch (UnknownAccountException e) {
                return LoginMessage.UnknownUsername();
            }
            catch (LockedAccountException e) {
                return LoginMessage.LockedAccount();
            }
            catch (IncorrectCredentialsException e) {
                return LoginMessage.IncrrentPassword();
            }
            catch (ExcessiveAttemptsException e) {
                return LoginMessage.TooManyTries();
            }

            return LoginMessage.LoginSuccess();
        } else {
            return LoginMessage.LoginAlready();
        }
    }

    @Override
    public RegisterMessage userRegister(RegisterForm form) {
        String username = form.getUsername();
        Users dbUser = usersMapper.selectByUsername(username);
        if (dbUser != null) {
            return RegisterMessage.DupUsername();
        }

        Subject currentUser = SecurityUtils.getSubject();
        Session currentSess = currentUser.getSession();

        String code = form.getCode();
        String dbCode = (String) currentSess.getAttribute("code");
        if(code != null && dbCode != null) {
            if (!dbCode.equals(code)) {
                return RegisterMessage.WrongCaptchaCode();
            }
        }else {
            return RegisterMessage.NullCaptchaCode();
        }

        String password = form.getPassword();
        String repassword = form.getRepassword();

        if (password != null && repassword != null) {
            if (!password.equals(repassword)) {
                return RegisterMessage.NotSamePassowrd();
            }
        }else {
            return RegisterMessage.NotSamePassowrd();
        }

        Users newUser = new Users();

        newUser.setUsername(username);

        String salt = RandomUtil.randomString(6);
        password = GuTool.doEncrypt(password, salt);
        newUser.setSalt(salt);
        newUser.setPassword(password);

        newUser.setResigterTime(new Date());
        newUser.setIsLocked(false);
        newUser.setIsHidden(false);
        newUser.setIsDeleted(false);
        newUser.setIsFirstLogin(false);

        usersMapper.insert(newUser);
        return RegisterMessage.RegisterSuccess();
    }
}
