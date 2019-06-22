package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    private Integer id;

    private String username;

    private String token;

    private String salt;

    private String password;

    private String headPicUrl;

    private Integer statusId;

    private Boolean isFirstLogin;

    private Date lastLoginTime;

    private Date lastLogoutTime;

    private Boolean isDeleted;

    private Boolean isHidden;

    private Boolean isLocked;

    private Date lastSpeakTime;

    private Date resigterTime;

    private Integer allMessages;

    private String remark;

    private static final long serialVersionUID = -6458508570145501100L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHeadPicUrl() {
        return headPicUrl;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl == null ? null : headPicUrl.trim();
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Boolean getIsFirstLogin() {
        return isFirstLogin;
    }

    public void setIsFirstLogin(Boolean isFirstLogin) {
        this.isFirstLogin = isFirstLogin;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Date getLastSpeakTime() {
        return lastSpeakTime;
    }

    public void setLastSpeakTime(Date lastSpeakTime) {
        this.lastSpeakTime = lastSpeakTime;
    }

    public Date getResigterTime() {
        return resigterTime;
    }

    public void setResigterTime(Date resigterTime) {
        this.resigterTime = resigterTime;
    }

    public Integer getAllMessages() {
        return allMessages;
    }

    public void setAllMessages(Integer allMessages) {
        this.allMessages = allMessages;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}