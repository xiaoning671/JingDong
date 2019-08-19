package com.jd.mapper;

import com.jd.enity.User_Info;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User_InfoMapper {
    List<User_Info> getAllUser();
    User_Info checkByName_Password(User_Info record);
    int have(User_Info record);
    int deleteByPrimaryKey(Integer id);

    int insert(User_Info record);

    int insertSelective(User_Info record);

    User_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User_Info record);

    int updateByPrimaryKey(User_Info record);
}