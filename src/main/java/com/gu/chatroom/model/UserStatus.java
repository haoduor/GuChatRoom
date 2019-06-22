package com.gu.chatroom.model;

import java.io.Serializable;

public class UserStatus implements Serializable {
    private Integer id;

    private String statusName;

    private String statusDescription;

    private static final long serialVersionUID = -8357522376591371924L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription == null ? null : statusDescription.trim();
    }
}