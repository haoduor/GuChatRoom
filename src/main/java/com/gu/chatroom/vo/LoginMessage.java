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

    public static LoginMessage NullLogin() {
        return new LoginMessage(-1, "未知的登录错误");
    }

    public static LoginMessage LoginSuccess() {
        return new LoginMessage(0, "登录成功");
    }

    public static LoginMessage LockedAccount() {
        return new LoginMessage(2, "用户被锁定了");
    }

    public static LoginMessage UnknownUsername() {
        return new LoginMessage(3, "用户名或者密码错误");
    }

    public static LoginMessage IncrrentPassword() {
        return UnknownUsername();
    }

    public static LoginMessage WrongCaptchaCode() {
        return new LoginMessage(4, "验证码错误");
    }

    public static LoginMessage TooManyTries() {
        return new LoginMessage(5, "尝试次数过多, 请稍后再试");
    }

    public static LoginMessage LoginAlready() {
        return new LoginMessage(10, "已经登录过了");
    }



}
