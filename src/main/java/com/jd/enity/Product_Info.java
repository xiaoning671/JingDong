package com.jd.enity;

import java.math.BigDecimal;
import java.util.Date;

public class Product_Info {
    private Integer id;

    private String name;

    private String title;

    private Date create_time;

    private BigDecimal min_price;

    private String discount;

    private Date warranty_data;

    private Integer status_id;

    private Product_Images product_images;

    public Product_Images getProduct_images() {
        return product_images;
    }

    public void setProduct_images(Product_Images product_images) {
        this.product_images = product_images;
    }


    @Override
    public String toString() {
        return "Product_Info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", create_time=" + create_time +
                ", min_price=" + min_price +
                ", discount='" + discount + '\'' +
                ", warranty_data=" + warranty_data +
                ", status_id=" + status_id +
                '}';
    }

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public BigDecimal getMin_price() {
        return min_price;
    }

    public void setMin_price(BigDecimal min_price) {
        this.min_price = min_price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    public Date getWarranty_data() {
        return warranty_data;
    }

    public void setWarranty_data(Date warranty_data) {
        this.warranty_data = warranty_data;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }
}