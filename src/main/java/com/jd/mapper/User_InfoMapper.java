package com.jd.mapper;

import com.jd.enity.User_Info;

public interface User_InfoMapper {
    int checkByName_Password(User_Info record);
    User_Info select_id(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(User_Info record);

    int insertSelective(User_Info record);

    User_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Info record);

    int updateByPrimaryKey(User_Info record);
}