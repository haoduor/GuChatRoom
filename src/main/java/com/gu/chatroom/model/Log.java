package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Integer id;

    private String controlIp;

    private Integer userId;

    private Integer premissionId;

    private String controlDescription;

    private Date controlTime;

    private static final long serialVersionUID = 1942734336482570297L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getControlIp() {
        return controlIp;
    }

    public void setControlIp(String controlIp) {
        this.controlIp = controlIp == null ? null : controlIp.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPremissionId() {
        return premissionId;
    }

    public void setPremissionId(Integer premissionId) {
        this.premissionId = premissionId;
    }

    public String getControlDescription() {
        return controlDescription;
    }

    public void setControlDescription(String controlDescription) {
        this.controlDescription = controlDescription == null ? null : controlDescription.trim();
    }

    public Date getControlTime() {
        return controlTime;
    }

    public void setControlTime(Date controlTime) {
        this.controlTime = controlTime;
    }
}