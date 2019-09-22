package com.example.marketim.model;

public class ProductModel {
    private String  date;
    private String  month;
    private String marketName;
    private String orderName;
    private String  productPrice;
    private String productState;
    private ProductDetailModel productDetail;

    public ProductModel() {
    }

    public ProductModel(String date, String month, String marketName, String orderName, String productPrice, String productState) {
        this.date = date;
        this.month = month;
        this.marketName = marketName;
        this.orderName = orderName;
        this.productPrice = productPrice;
        this.productState = productState;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductState() {
        return productState;
    }

    public void setProductState(String productState) {
        this.productState = productState;
    }

    public ProductDetailModel getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetailModel productDetail) {
        this.productDetail = productDetail;
    }
}
