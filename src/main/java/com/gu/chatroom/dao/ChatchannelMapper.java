package com.gu.chatroom.dao;

import com.gu.chatroom.model.Chatchannel;
import com.gu.chatroom.model.ChatchannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatchannelMapper {
    int countByExample(ChatchannelExample example);

    int deleteByExample(ChatchannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chatchannel record);

    int insertSelective(Chatchannel record);

    List<Chatchannel> selectByExample(ChatchannelExample example);

    Chatchannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chatchannel record, @Param("example") ChatchannelExample example);

    int updateByExample(@Param("record") Chatchannel record, @Param("example") ChatchannelExample example);

    int updateByPrimaryKeySelective(Chatchannel record);

    int updateByPrimaryKey(Chatchannel record);
}