package com.gu.chatroom.vo;

import lombok.Data;

/**
 * @className: com.gu.chatroom.vo.RegisterForm
 * @description: RegisterForm - TODO
 * @version: v1.0.0
 * @date: 2019/6/25 19:12
 * @author: haoduor
 */
@Data
public class RegisterForm {
    private String username;
    private String password;
    private String repassword;
    private String code;
}
