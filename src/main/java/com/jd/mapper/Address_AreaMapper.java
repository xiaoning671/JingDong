package com.jd.mapper;

import com.jd.enity.Address_Area;

public interface Address_AreaMapper {
    int deleteByPrimaryKey(Integer a_areaid);

    int insert(Address_Area record);

    int insertSelective(Address_Area record);

    Address_Area selectByPrimaryKey(Integer a_areaid);

    int updateByPrimaryKeySelective(Address_Area record);

    int updateByPrimaryKey(Address_Area record);
}