package com.gu.chatroom.dao;

import com.gu.chatroom.model.EmojiPackage;
import com.gu.chatroom.model.EmojiPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmojiPackageMapper {
    int countByExample(EmojiPackageExample example);

    int deleteByExample(EmojiPackageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmojiPackage record);

    int insertSelective(EmojiPackage record);

    List<EmojiPackage> selectByExample(EmojiPackageExample example);

    EmojiPackage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmojiPackage record, @Param("example") EmojiPackageExample example);

    int updateByExample(@Param("record") EmojiPackage record, @Param("example") EmojiPackageExample example);

    int updateByPrimaryKeySelective(EmojiPackage record);

    int updateByPrimaryKey(EmojiPackage record);
}