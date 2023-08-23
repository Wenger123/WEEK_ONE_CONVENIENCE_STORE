package com.francis_store.entities;

import com.francis_store.enums.ProductCategory;

public class Product {
    private String productName;
    private int price;
    private int quantity;
    private String productColour;
    private ProductCategory categoryName;

    public Product(String productName, int price, int quantity, String productColour, ProductCategory categoryName) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productColour = productColour;
        this.categoryName = categoryName;
    }
    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public ProductCategory getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(ProductCategory categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", productColour='" + productColour + '\'' +
                ", categoryName=" + categoryName +
                '}';
    }
}
