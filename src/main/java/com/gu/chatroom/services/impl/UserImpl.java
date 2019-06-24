package com.gu.chatroom.services.impl;

import com.gu.chatroom.dao.UsersMapper;
import com.gu.chatroom.model.Users;
import com.gu.chatroom.services.UserServices;
import com.gu.chatroom.vo.LoginMessage;
import com.sun.org.apache.bcel.internal.generic.LMUL;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
            currentUser.login(token);
            return LoginMessage.LoginSuccess();
        } else {
            return LoginMessage.LoginAlready();
        }
    }
}
