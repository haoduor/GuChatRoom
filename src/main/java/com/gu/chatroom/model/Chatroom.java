package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Chatroom implements Serializable {
    private Integer id;

    private Integer creator;

    private String roomIntroduction;

    private Date createTime;

    private Boolean isHidden;

    private Boolean isDeleted;

    private Boolean isLocked;

    private byte[] roomName;

    private static final long serialVersionUID = 1837956564864953910L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getRoomIntroduction() {
        return roomIntroduction;
    }

    public void setRoomIntroduction(String roomIntroduction) {
        this.roomIntroduction = roomIntroduction == null ? null : roomIntroduction.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public byte[] getRoomName() {
        return roomName;
    }

    public void setRoomName(byte[] roomName) {
        this.roomName = roomName;
    }
}