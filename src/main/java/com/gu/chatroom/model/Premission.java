package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Premission implements Serializable {
    private Integer id;

    private String premissionName;

    private String premissionDescription;

    private Date createTime;

    private static final long serialVersionUID = 354534635672270629L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPremissionName() {
        return premissionName;
    }

    public void setPremissionName(String premissionName) {
        this.premissionName = premissionName == null ? null : premissionName.trim();
    }

    public String getPremissionDescription() {
        return premissionDescription;
    }

    public void setPremissionDescription(String premissionDescription) {
        this.premissionDescription = premissionDescription == null ? null : premissionDescription.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}