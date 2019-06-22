package com.gu.chatroom.dao;

import com.gu.chatroom.model.UserRoom;
import com.gu.chatroom.model.UserRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoomMapper {
    int countByExample(UserRoomExample example);

    int deleteByExample(UserRoomExample example);

    int insert(UserRoom record);

    int insertSelective(UserRoom record);

    List<UserRoom> selectByExample(UserRoomExample example);

    int updateByExampleSelective(@Param("record") UserRoom record, @Param("example") UserRoomExample example);

    int updateByExample(@Param("record") UserRoom record, @Param("example") UserRoomExample example);
}