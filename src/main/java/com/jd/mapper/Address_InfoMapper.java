package com.jd.mapper;

import com.jd.enity.Address_Info;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Address_InfoMapper {

    List<Address_Info> selectByUserId(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Address_Info record);

    int insertSelective(Address_Info record);

    Address_Info selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address_Info record);

    int updateByPrimaryKey(Address_Info record);
}