package com.gu.chatroom.services.impl;

import com.gu.chatroom.dao.UsersMapper;
import com.gu.chatroom.model.Users;
import com.gu.chatroom.services.UserServices;
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
}
