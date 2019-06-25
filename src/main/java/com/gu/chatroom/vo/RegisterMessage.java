package com.gu.chatroom.vo;

/**
 * @className: com.gu.chatroom.vo.RegisterMessage
 * @description: RegisterMessage - TODO
 * @version: v1.0.0
 * @date: 2019/6/25 15:31
 * @author: haoduor
 */
public class RegisterMessage extends BaseMessage {

    public RegisterMessage(int id, String message) {
        super(id, message);
    }

    public static RegisterMessage RegisterSuccess() {
        return new RegisterMessage(0, "注册成功");
    }

    public static RegisterMessage NullPara() {
        return new RegisterMessage(1, "值不能为空");
    }

    public static RegisterMessage DupUsername() {
        return new RegisterMessage(2, "用户名被占用");
    }

    public static RegisterMessage NullCaptchaCode() {
        return new RegisterMessage(3, "验证码错误");
    }

    public static RegisterMessage WrongCaptchaCode() {
        return NullCaptchaCode();
    }

    public static RegisterMessage NotSamePassowrd() {
        return new RegisterMessage(4, "两次密码不相同");
    }

}
