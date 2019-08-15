package com.jd.service;

import com.jd.enity.Product_Version;

import java.util.List;

public interface Product_VersionService {

    public List<Product_Version> getPVersionById(List<Integer> list);
    public List<String> getImgUrlByID(List<Integer> list);

}
