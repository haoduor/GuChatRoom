package com.gu.chatroom.controller;

import com.gu.chatroom.model.Users;
import com.gu.chatroom.services.UserServices;
import com.gu.chatroom.vo.BaseMessage;
import com.gu.chatroom.vo.LoginMessage;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @className: com.gu.chatroom.controller.TestController
 * @description: TestController - TODO
 * @version: v1.0.0
 * @date: 2019/6/22 21:51
 * @author: haoduor
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserServices userServices;

    @ResponseBody
    @GetMapping("/message")
    public BaseMessage testMessage() {
        return LoginMessage.UnknownUsername();
    }

    @ResponseBody
    @GetMapping("/users")
    public Users testUsers(@RequestParam("name") String username) {
        return userServices.getUserByName(username);
    }

    @ResponseBody
    @GetMapping("/userC")
    public Object getUserCaptcha() {
        Subject subject = SecurityUtils.getSubject();
        Session s = subject.getSession();
        return s.getAttribute("code");
    }
}
