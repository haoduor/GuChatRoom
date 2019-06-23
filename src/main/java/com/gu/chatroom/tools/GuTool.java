package com.gu.chatroom.tools;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

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
            SimpleHash hash = new SimpleHash("MD5", password, salt, 3);
            return hash.toString();
        }
        return null;
    }

    public static String doEncrypt(String password, ByteSource salt) {
        if (password != null && salt != null) {
            SimpleHash hash = new SimpleHash("MD5", password, salt, 3);
            return hash.toString();
        }
        return null;
    }

}
