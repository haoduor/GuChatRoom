package com.gu.chatroom.dao;

import com.gu.chatroom.model.Banned;
import com.gu.chatroom.model.BannedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannedMapper {
    int countByExample(BannedExample example);

    int deleteByExample(BannedExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Banned record);

    int insertSelective(Banned record);

    List<Banned> selectByExample(BannedExample example);

    Banned selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Banned record, @Param("example") BannedExample example);

    int updateByExample(@Param("record") Banned record, @Param("example") BannedExample example);

    int updateByPrimaryKeySelective(Banned record);

    int updateByPrimaryKey(Banned record);
}