package com.gu.chatroom.services;

import com.gu.chatroom.model.Users;
import com.gu.chatroom.vo.LoginMessage;
import com.gu.chatroom.vo.RegisterForm;
import com.gu.chatroom.vo.RegisterMessage;

/**
 * @className: com.gu.chatroom.services.UserServices
 * @description: UserServices - TODO
 * @version: v1.0.0
 * @date: 2019/6/14 10:23
 * @author: haoduor
 */
public interface UserServices {
    Users getUserbyid(int id);
    Users getUserByName(String username);
    LoginMessage userLogin(String username, String password, String code);
    RegisterMessage userRegister(RegisterForm form);
}
