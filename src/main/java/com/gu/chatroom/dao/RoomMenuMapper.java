package com.gu.chatroom.dao;

import com.gu.chatroom.model.RoomMenu;
import com.gu.chatroom.model.RoomMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMenuMapper {
    int countByExample(RoomMenuExample example);

    int deleteByExample(RoomMenuExample example);

    int insert(RoomMenu record);

    int insertSelective(RoomMenu record);

    List<RoomMenu> selectByExample(RoomMenuExample example);

    int updateByExampleSelective(@Param("record") RoomMenu record, @Param("example") RoomMenuExample example);

    int updateByExample(@Param("record") RoomMenu record, @Param("example") RoomMenuExample example);
}