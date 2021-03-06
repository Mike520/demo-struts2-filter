package com.cool.struts2.helloworld;

import java.util.Iterator;
import java.util.List;

/**
 * Created by liwenxiang on 2016/4/6.
 */
public class Product {
    String productId;
    String productName;
    String productDesc;
    double productPrice;

    public Product(String productId, String productName, String productDesc, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                ", productPrice='" + productPrice + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Product.main");
        System.out.println("args = [" + args + "]");
        Product product = new Product("12", "mouse", "click", 12.2);
        System.out.println("product = " + product.toString());
    }


}
