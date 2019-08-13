package com.jd.enity;

public class Product_SmallClass {
    private Integer id;

    private String name;

    private Integer bigclass_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getBigclass_id() {
        return bigclass_id;
    }

    public void setBigclass_id(Integer bigclass_id) {
        this.bigclass_id = bigclass_id;
    }
}