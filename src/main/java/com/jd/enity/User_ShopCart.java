package com.jd.enity;

public class User_ShopCart {
    private Integer id;

    private Integer user_id;

    private Integer produce_id;

    private Integer pversion_id;

    private Integer amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getProduce_id() {
        return produce_id;
    }

    public void setProduce_id(Integer produce_id) {
        this.produce_id = produce_id;
    }

    public Integer getPversion_id() {
        return pversion_id;
    }

    public void setPversion_id(Integer pversion_id) {
        this.pversion_id = pversion_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}