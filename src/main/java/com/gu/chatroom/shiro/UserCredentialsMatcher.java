package com.gu.chatroom.shiro;

import com.gu.chatroom.tools.GuTool;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;
import org.apache.shiro.util.ByteSource;

/**
 * @className: com.gu.chatroom.shiro.UserCredentialsMatcher
 * @description: UserCredentialsMatcher - TODO
 * @version: v1.0.0
 * @date: 2019/6/21 10:18
 * @author: haoduor
 */
public class UserCredentialsMatcher extends SimpleCredentialsMatcher {
    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        if (info instanceof SimpleAuthenticationInfo && token instanceof UsernamePasswordToken) {
            SimpleAuthenticationInfo dbinfo = (SimpleAuthenticationInfo) info;
            ByteSource salt = dbinfo.getCredentialsSalt();

            String password = String.valueOf(((UsernamePasswordToken)token).getPassword());
            String inpassword = GuTool.doEncrypt(password, salt);
            String dbpassword = (String)dbinfo.getCredentials();
            return equals(inpassword, dbpassword);
        }
        else {
            return false;
        }
    }
}
