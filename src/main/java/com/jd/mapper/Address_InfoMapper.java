package com.jd.mapper;

import com.jd.enity.Address_Info;

public interface Address_InfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address_Info record);

    int insertSelective(Address_Info record);

    Address_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address_Info record);

    int updateByPrimaryKey(Address_Info record);
}