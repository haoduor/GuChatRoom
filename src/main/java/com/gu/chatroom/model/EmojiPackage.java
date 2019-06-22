package com.gu.chatroom.model;

import java.io.Serializable;
import java.util.Date;

public class EmojiPackage implements Serializable {
    private Integer id;

    private String emojiName;

    private Date createTime;

    private static final long serialVersionUID = -1352329525645958942L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmojiName() {
        return emojiName;
    }

    public void setEmojiName(String emojiName) {
        this.emojiName = emojiName == null ? null : emojiName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}