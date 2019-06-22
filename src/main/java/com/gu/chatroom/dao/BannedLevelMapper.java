package com.gu.chatroom.dao;

import com.gu.chatroom.model.BannedLevel;
import com.gu.chatroom.model.BannedLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannedLevelMapper {
    int countByExample(BannedLevelExample example);

    int deleteByExample(BannedLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BannedLevel record);

    int insertSelective(BannedLevel record);

    List<BannedLevel> selectByExample(BannedLevelExample example);

    BannedLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BannedLevel record, @Param("example") BannedLevelExample example);

    int updateByExample(@Param("record") BannedLevel record, @Param("example") BannedLevelExample example);

    int updateByPrimaryKeySelective(BannedLevel record);

    int updateByPrimaryKey(BannedLevel record);
}