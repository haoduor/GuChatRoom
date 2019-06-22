package com.gu.chatroom.model;

import java.io.Serializable;

public class EmojiPic implements Serializable {
    private Integer emojiId;

    private Integer picId;

    private static final long serialVersionUID = 6189355446417867577L;

    public Integer getEmojiId() {
        return emojiId;
    }

    public void setEmojiId(Integer emojiId) {
        this.emojiId = emojiId;
    }

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }
}