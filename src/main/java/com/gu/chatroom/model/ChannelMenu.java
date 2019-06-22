package com.gu.chatroom.model;

import java.io.Serializable;

public class ChannelMenu implements Serializable {
    private Integer userId;

    private Integer roomId;

    private Integer channelId;

    private Integer roleId;

    private static final long serialVersionUID = 4511626424432526802L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}