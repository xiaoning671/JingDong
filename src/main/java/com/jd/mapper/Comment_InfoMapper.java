package com.jd.mapper;

import com.jd.enity.Comment_Info;

public interface Comment_InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Comment_Info record);

    int insertSelective(Comment_Info record);

    Comment_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Comment_Info record);

    int updateByPrimaryKey(Comment_Info record);
}