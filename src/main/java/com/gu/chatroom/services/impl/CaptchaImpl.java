package com.gu.chatroom.services.impl;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.ImageUtil;
import cn.hutool.core.util.RandomUtil;
import com.gu.chatroom.services.CaptchaServices;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @className: com.gu.chatroom.services.impl.CaptchaImpl
 * @description: CaptchaImpl - TODO
 * @version: v1.0.0
 * @date: 2019/6/16 11:07
 * @author: haoduor
 */

@Service
public class CaptchaImpl implements CaptchaServices {

    @Override
    public void getCaptcha(HttpServletResponse response) {
        LineCaptcha captcha = CaptchaUtil.createLineCaptcha(200, 100, 6, 200);

        String code = RandomUtil.randomString(6);

        // 重新设置用户的session
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute("code", code);

        Image image = captcha.createImage(code);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ImageUtil.writePng(image, out);

        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");

        try {
            IoUtil.write(response.getOutputStream(), true, out.toByteArray());
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("生成失败");
        }

    }
}
