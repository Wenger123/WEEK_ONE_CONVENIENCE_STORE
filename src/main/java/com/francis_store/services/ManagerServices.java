package com.francis_store.services;

import com.francis_store.enums.ProductCategory;

public interface ManagerServices {
    public boolean hireCashier(String name, int age, String email, int id, String address, double salary);
    public boolean sackCashier(String name);
    public void addProduct(String productName, int price, int quantity, String productColour, ProductCategory categoryName);
    public void removeProduct(String name);
}
