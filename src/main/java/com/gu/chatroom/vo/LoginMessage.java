package com.gu.chatroom.vo;

/**
 * @className: com.gu.chatroom.vo.LoginMessage
 * @description: LoginMessage - TODO
 * @version: v1.0.0
 * @date: 2019/6/22 22:03
 * @author: haoduor
 */

public class LoginMessage extends BaseMessage{

    public LoginMessage(int id, String message) {
        super(id, message);
    }

    public static LoginMessage UnknownUsername() {
        return new LoginMessage(1, "无效用户名");
    }
}
