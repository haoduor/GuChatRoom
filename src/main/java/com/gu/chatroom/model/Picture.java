package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Picture implements Serializable {
    private Integer id;

    private String picName;

    private Integer userId;

    private Date uploadTime;

    private static final long serialVersionUID = 8694574460215315348L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}