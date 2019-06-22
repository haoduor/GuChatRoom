package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class LastSpeakChannel implements Serializable {
    private Integer userId;

    private Integer atRoom;

    private Integer atChannel;

    private Date lastSpeakTime;

    private static final long serialVersionUID = -4758191918206305225L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAtRoom() {
        return atRoom;
    }

    public void setAtRoom(Integer atRoom) {
        this.atRoom = atRoom;
    }

    public Integer getAtChannel() {
        return atChannel;
    }

    public void setAtChannel(Integer atChannel) {
        this.atChannel = atChannel;
    }

    public Date getLastSpeakTime() {
        return lastSpeakTime;
    }

    public void setLastSpeakTime(Date lastSpeakTime) {
        this.lastSpeakTime = lastSpeakTime;
    }
}