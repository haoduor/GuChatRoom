package com.gu.chatroom;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.SecureUtil;
import com.gu.chatroom.tools.GuTool;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Assert;
import org.junit.Test;

/**
 * @className: com.gu.chatroom.TokenTest
 * @description: TokenTest - TODO
 * @version: v1.0.0
 * @date: 2019/6/23 15:08
 * @author: haoduor
 */
public class TokenTest {

    @Test
    public void TestByteSource() {
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo();
        String salt = "AAAA";

        info.setCredentialsSalt(ByteSource.Util.bytes(salt));

        String getSalt = info.getCredentialsSalt().toString();
        getSalt = Base64.decodeStr(getSalt);

        Assert.assertEquals("ByteSource转换", salt, getSalt);
    }

    @Test
    public void TestBase64() {
        String str = "广州";

        String encode = Base64.encode(str);
        String target = Base64.decodeStr(encode);

        Assert.assertEquals("相等", str, target);
    }

    @Test
    public void TestMD5() {
        String source = "ASDQWEZXC";

        String A = SecureUtil.md5(source);
        String B = (new SimpleHash("MD5", source).toString());

        Assert.assertEquals("md5:", A, B);
    }

    @Test
    public void TestEncrypt() {
        String password = "qwe123";
        String salt = RandomUtil.randomString(6);
        System.out.println(String.format("%s %s", password, salt));

        String A = doEncryptA(password, salt);
        String B = doEncryptB(password, salt);

        Assert.assertEquals("shiro 加密", A, B);
    }

    @Test
    public void ShiroMd5() {
        String password = "qwe123";
        String salt = RandomUtil.randomString(6);
        System.out.println(String.format("%s %s", password, salt));
        SimpleHash hash = new SimpleHash("MD5", password, salt, 2);
        System.out.println(hash.toString());

        ByteSource s = ByteSource.Util.bytes(salt);
        System.out.println(GuTool.doEncrypt("qwe123", "AAAAAA"));
    }

    public String doEncryptA(String password, String salt){
        if (password != null && salt != null) {
            password = SecureUtil.md5(password);
            return SecureUtil.md5(password + salt);
        }
        return null;
    }

    public String doEncryptB(String password, String salt) {
        if (password != null && salt != null) {
            SimpleHash hash = new SimpleHash("MD5", password);
            SimpleHash res = new SimpleHash("MD5", hash.toString() + salt);
            return res.toString();
        }
        return null;
    }


}
