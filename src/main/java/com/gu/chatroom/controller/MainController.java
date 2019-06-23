package com.gu.chatroom.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @className: com.gu.chatroom.controller.MainController
 * @description: MainController - TODO
 * @version: v1.0.0
 * @date: 2019/6/13 10:06
 * @author: haoduor
 */

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello () {
        return "login";
    }

    @RequestMapping(value = "/session", method = RequestMethod.GET)
    public String session(HttpServletRequest request, Model model) {
        HttpSession session = request.getSession();

        ICaptcha captcha = CaptchaUtil.createShearCaptcha(200, 100);
        session.setAttribute("captch", captcha.getCode());

        model.addAttribute("A", request.getSession().getId());
        model.addAttribute("captch", session.getAttribute("captch"));
        return "session";
    }

}
