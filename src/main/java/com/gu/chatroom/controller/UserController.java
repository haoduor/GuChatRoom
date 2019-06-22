package com.gu.chatroom.controller;

import com.gu.chatroom.model.Users;
import com.gu.chatroom.services.UserServices;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @className: com.gu.chatroom.controller.UserController
 * @description: UserController - TODO
 * @version: v1.0.0
 * @date: 2019/6/14 10:28
 * @author: haoduor
 */
@Controller
public class UserController {

    @Autowired
    UserServices userServices;

    @ResponseBody
    @GetMapping("/user")
    public Users getUser() {
        return userServices.getUserbyid(1);
    }

    @GetMapping("/login")
    public String userLogin() {
        return "login";
    }

    @ResponseBody
    @PostMapping("/login")
    public Map<String, Object> userLogin(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        Subject currentUser = SecurityUtils.getSubject();

        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken(username, password);
            currentUser.login(token);
        }

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        return null;
    }

    @GetMapping("/register")
    public String userRegister() {
        return "register";
    }

    @ResponseBody
    @PostMapping("/register")
    public Map<String, Object> userRegister(HttpServletRequest request) {
        return null;
    }
}
