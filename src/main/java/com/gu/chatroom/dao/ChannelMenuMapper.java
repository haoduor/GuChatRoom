package com.gu.chatroom.dao;

import com.gu.chatroom.model.ChannelMenu;
import com.gu.chatroom.model.ChannelMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelMenuMapper {
    int countByExample(ChannelMenuExample example);

    int deleteByExample(ChannelMenuExample example);

    int insert(ChannelMenu record);

    int insertSelective(ChannelMenu record);

    List<ChannelMenu> selectByExample(ChannelMenuExample example);

    int updateByExampleSelective(@Param("record") ChannelMenu record, @Param("example") ChannelMenuExample example);

    int updateByExample(@Param("record") ChannelMenu record, @Param("example") ChannelMenuExample example);
}