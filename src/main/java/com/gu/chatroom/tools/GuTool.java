package com.gu.chatroom.tools;

import cn.hutool.crypto.SecureUtil;

/**
 * @className: com.gu.chatroom.tools.GuTool
 * @description: GuTool - 鸽子工具类
 * @version: v1.0.0
 * @date: 2019/6/22 15:42
 * @author: haoduor
 */
public class GuTool {

    /**
     * 用于加密密码的方法
     *
     * @param password 密码
     * @param salt 盐
     * @return 加密后的密码
     */
    public static String doEncrypt(String password, String salt) {
        if (password != null && salt != null) {
            password = SecureUtil.md5(password);
            return SecureUtil.md5(password + salt);
        }
        return null;
    }
}
