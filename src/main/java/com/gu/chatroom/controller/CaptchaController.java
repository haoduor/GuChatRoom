package com.gu.chatroom.controller;

import com.gu.chatroom.services.CaptchaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.gu.chatroom.controller.CaptchaController
 * @description: CaptchaController - TODO
 * @version: v1.0.0
 * @date: 2019/6/16 11:20
 * @author: haoduor
 */

@Controller
@RequestMapping("/captcha")
public class CaptchaController {

    @Autowired
    private CaptchaServices captcha;

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public void createCode(HttpServletRequest request, HttpServletResponse response) {
        captcha.getCaptcha(response);
    }
}
