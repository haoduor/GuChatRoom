package com.gu.chatroom.dao;

import com.gu.chatroom.model.RolePremission;
import com.gu.chatroom.model.RolePremissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePremissionMapper {
    int countByExample(RolePremissionExample example);

    int deleteByExample(RolePremissionExample example);

    int insert(RolePremission record);

    int insertSelective(RolePremission record);

    List<RolePremission> selectByExample(RolePremissionExample example);

    int updateByExampleSelective(@Param("record") RolePremission record,
            @Param("example") RolePremissionExample example);

    int updateByExample(@Param("record") RolePremission record, @Param("example") RolePremissionExample example);
}