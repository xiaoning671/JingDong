package com.jd.service;

import com.jd.enity.Address_Info;
import com.jd.mapper.Address_InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_InfoServiceImpl implements Address_InfoService {

    @Autowired
    Address_InfoMapper address_infoMapper;

    @Override
    public List<Address_Info> getAllAddressByUserId(int id) {
        return address_infoMapper.selectByUserId(id);
    }

    @Override
    public int insertAddress_info(Address_Info address_info) {

        return address_infoMapper.insert(address_info);
    }
}
