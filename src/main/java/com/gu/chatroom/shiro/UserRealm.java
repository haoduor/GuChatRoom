package com.gu.chatroom.shiro;

import com.gu.chatroom.services.UserServices;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @className: com.gu.chatroom.shiro.userRealm
 * @description: userRealm - TODO
 * @version: v1.0.0
 * @date: 2019/6/20 19:51
 * @author: haoduor
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserServices userServices;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
    throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) authenticationToken;
        String username = upToken.getUsername();


        String realmName = getName();
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo();
        return null;
    }

}
