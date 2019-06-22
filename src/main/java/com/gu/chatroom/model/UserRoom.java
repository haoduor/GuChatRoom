package com.gu.chatroom.model;

import java.io.Serializable;

public class UserRoom implements Serializable {
    private Integer userId;

    private Integer roomId;

    private static final long serialVersionUID = -3054176789462321411L;

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
}