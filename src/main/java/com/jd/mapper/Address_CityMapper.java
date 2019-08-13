package com.jd.mapper;

import com.jd.enity.Address_City;

public interface Address_CityMapper {
    int deleteByPrimaryKey(Integer a_cid);

    int insert(Address_City record);

    int insertSelective(Address_City record);

    Address_City selectByPrimaryKey(Integer a_cid);

    int updateByPrimaryKeySelective(Address_City record);

    int updateByPrimaryKey(Address_City record);
}