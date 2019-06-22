package com.gu.chatroom.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

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
        if (info instanceof SimpleAuthenticationInfo) {

        }
        else {
            throw new AuthenticationException();
        }

        return super.doCredentialsMatch(token, info);
    }
}
