package com.panda.bee.pojo.entity;

import java.io.Serializable;

/**
 * order_info
 * @author 
 */
public class OrderInfo implements Serializable {
    private Integer orderInfoId;

    private String orderId;

    private Integer originGoodId;

    private Double price;

    private Integer count;

    private String img;

    private Double oldPrice;

    private static final long serialVersionUID = 1L;

    public Integer getOrderInfoId() {
        return orderInfoId;
    }

    public void setOrderInfoId(Integer orderInfoId) {
        this.orderInfoId = orderInfoId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getOriginGoodId() {
        return originGoodId;
    }

    public void setOriginGoodId(Integer originGoodId) {
        this.originGoodId = originGoodId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }
}