package com.gu.chatroom.model;

import java.io.Serializable;

public class RoomMenu implements Serializable {
    private Integer userId;

    private Integer roomId;

    private Integer roleId;

    private static final long serialVersionUID = 7215811034166112193L;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}