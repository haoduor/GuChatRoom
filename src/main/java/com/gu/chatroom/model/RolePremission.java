package com.gu.chatroom.model;

import java.io.Serializable;

public class RolePremission implements Serializable {
    private Integer premissionId;

    private Integer roleId;

    private static final long serialVersionUID = -3084350092722588442L;

    public Integer getPremissionId() {
        return premissionId;
    }

    public void setPremissionId(Integer premissionId) {
        this.premissionId = premissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}