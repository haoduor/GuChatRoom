package com.gu.chatroom.model;

import java.io.Serializable;

public class BannedLevel implements Serializable {
    private Integer id;

    private String bannedName;

    private String bannedDescription;

    private static final long serialVersionUID = -8196163335390261538L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannedName() {
        return bannedName;
    }

    public void setBannedName(String bannedName) {
        this.bannedName = bannedName == null ? null : bannedName.trim();
    }

    public String getBannedDescription() {
        return bannedDescription;
    }

    public void setBannedDescription(String bannedDescription) {
        this.bannedDescription = bannedDescription == null ? null : bannedDescription.trim();
    }
}