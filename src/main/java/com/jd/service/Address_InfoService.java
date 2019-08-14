package com.jd.service;

import com.jd.enity.Address_Info;

import java.util.List;

public interface Address_InfoService {
    public List<Address_Info> getAllAddressByUserId(int id);
}
