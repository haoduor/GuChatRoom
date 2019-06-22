package com.gu.chatroom.services;

import javax.servlet.http.HttpServletResponse;

/**
 * @className: com.gu.chatroom.services.CaptchaServices
 * @description: CaptchaServices - TODO
 * @version: v1.0.0
 * @date: 2019/6/16 11:06
 * @author: haoduor
 */
public interface CaptchaServices {
    public void getCaptcha(HttpServletResponse response);
}
