package com.jd.mapper;

import com.jd.enity.Address_Province;

public interface Address_ProvinceMapper {
    int deleteByPrimaryKey(Integer a_pid);

    int insert(Address_Province record);

    int insertSelective(Address_Province record);

    Address_Province selectByPrimaryKey(Integer a_pid);

    int updateByPrimaryKeySelective(Address_Province record);

    int updateByPrimaryKey(Address_Province record);
}