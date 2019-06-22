package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Banned implements Serializable {
    private Integer id;

    private Integer bannedUserId;

    private Integer bannedLevel;

    private Integer bannedRoomId;

    private Integer bannedChannelId;

    private Date bannedTime;

    private String bannedReason;

    private Boolean isForeverBanned;

    private Date createTime;

    private Integer createUserId;

    private Date bannedToTime;

    private static final long serialVersionUID = 4736301430741822773L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBannedUserId() {
        return bannedUserId;
    }

    public void setBannedUserId(Integer bannedUserId) {
        this.bannedUserId = bannedUserId;
    }

    public Integer getBannedLevel() {
        return bannedLevel;
    }

    public void setBannedLevel(Integer bannedLevel) {
        this.bannedLevel = bannedLevel;
    }

    public Integer getBannedRoomId() {
        return bannedRoomId;
    }

    public void setBannedRoomId(Integer bannedRoomId) {
        this.bannedRoomId = bannedRoomId;
    }

    public Integer getBannedChannelId() {
        return bannedChannelId;
    }

    public void setBannedChannelId(Integer bannedChannelId) {
        this.bannedChannelId = bannedChannelId;
    }

    public Date getBannedTime() {
        return bannedTime;
    }

    public void setBannedTime(Date bannedTime) {
        this.bannedTime = bannedTime;
    }

    public String getBannedReason() {
        return bannedReason;
    }

    public void setBannedReason(String bannedReason) {
        this.bannedReason = bannedReason == null ? null : bannedReason.trim();
    }

    public Boolean getIsForeverBanned() {
        return isForeverBanned;
    }

    public void setIsForeverBanned(Boolean isForeverBanned) {
        this.isForeverBanned = isForeverBanned;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Date getBannedToTime() {
        return bannedToTime;
    }

    public void setBannedToTime(Date bannedToTime) {
        this.bannedToTime = bannedToTime;
    }
}