package com.example.marketim.model;

public class ProductDetailModel {

    private String orderDetail;
    private float summaryPrice;

    public ProductDetailModel() {
    }

    public ProductDetailModel(String orderDetail, float summaryPrice) {
        this.orderDetail = orderDetail;
        this.summaryPrice = summaryPrice;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    public float getSummaryPrice() {
        return summaryPrice;
    }

    public void setSummaryPrice(float summaryPrice) {
        this.summaryPrice = summaryPrice;
    }
}
