package com.gu.chatroom.dao;

import com.gu.chatroom.model.EmojiPic;
import com.gu.chatroom.model.EmojiPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmojiPicMapper {
    int countByExample(EmojiPicExample example);

    int deleteByExample(EmojiPicExample example);

    int insert(EmojiPic record);

    int insertSelective(EmojiPic record);

    List<EmojiPic> selectByExample(EmojiPicExample example);

    int updateByExampleSelective(@Param("record") EmojiPic record, @Param("example") EmojiPicExample example);

    int updateByExample(@Param("record") EmojiPic record, @Param("example") EmojiPicExample example);
}