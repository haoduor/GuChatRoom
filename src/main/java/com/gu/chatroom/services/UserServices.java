package com.gu.chatroom.services;

import com.gu.chatroom.model.Users;

import javax.validation.Valid;

/**
 * @className: com.gu.chatroom.services.UserServices
 * @description: UserServices - TODO
 * @version: v1.0.0
 * @date: 2019/6/14 10:23
 * @author: haoduor
 */
public interface UserServices {
    Users getUserbyid(@Valid int id);
    public Users getUserByName(@Valid String username);
}
