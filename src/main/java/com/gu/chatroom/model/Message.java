package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    private Integer id;

    private Integer sender;

    private Integer receiver;

    private Integer chatroom;

    private Integer channel;

    private String message;

    private Date sendTime;

    private Boolean isRecall;

    private Boolean isDelete;

    private static final long serialVersionUID = -7933291995425364664L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSender() {
        return sender;
    }

    public void setSender(Integer sender) {
        this.sender = sender;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getChatroom() {
        return chatroom;
    }

    public void setChatroom(Integer chatroom) {
        this.chatroom = chatroom;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Boolean getIsRecall() {
        return isRecall;
    }

    public void setIsRecall(Boolean isRecall) {
        this.isRecall = isRecall;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}