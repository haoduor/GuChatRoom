package com.gu.chatroom.dao;

import com.gu.chatroom.model.Chatroom;
import com.gu.chatroom.model.ChatroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatroomMapper {
    int countByExample(ChatroomExample example);

    int deleteByExample(ChatroomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chatroom record);

    int insertSelective(Chatroom record);

    List<Chatroom> selectByExampleWithBLOBs(ChatroomExample example);

    List<Chatroom> selectByExample(ChatroomExample example);

    Chatroom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chatroom record, @Param("example") ChatroomExample example);

    int updateByExampleWithBLOBs(@Param("record") Chatroom record, @Param("example") ChatroomExample example);

    int updateByExample(@Param("record") Chatroom record, @Param("example") ChatroomExample example);

    int updateByPrimaryKeySelective(Chatroom record);

    int updateByPrimaryKeyWithBLOBs(Chatroom record);

    int updateByPrimaryKey(Chatroom record);
}