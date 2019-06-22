package com.gu.chatroom.dao;

import com.gu.chatroom.model.LastSpeakChannel;
import com.gu.chatroom.model.LastSpeakChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LastSpeakChannelMapper {
    int countByExample(LastSpeakChannelExample example);

    int deleteByExample(LastSpeakChannelExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(LastSpeakChannel record);

    int insertSelective(LastSpeakChannel record);

    List<LastSpeakChannel> selectByExample(LastSpeakChannelExample example);

    LastSpeakChannel selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") LastSpeakChannel record,
            @Param("example") LastSpeakChannelExample example);

    int updateByExample(@Param("record") LastSpeakChannel record, @Param("example") LastSpeakChannelExample example);

    int updateByPrimaryKeySelective(LastSpeakChannel record);

    int updateByPrimaryKey(LastSpeakChannel record);
}