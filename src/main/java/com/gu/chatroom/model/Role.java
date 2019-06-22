package com.gu.chatroom.model;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer id;

    private String roleName;

    private static final long serialVersionUID = -6188790826035218176L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }
}