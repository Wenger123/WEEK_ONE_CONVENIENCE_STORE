package com.francis_store.services;

import com.francis_store.entities.Cashier;
import com.francis_store.entities.Product;
import com.francis_store.services.implimentation.CashierServicesImplementation;

import java.util.List;

public interface CustomerServices {

 public boolean addToCart(String prodName, int quantity);
 public void buyProduct(CashierServicesImplementation cashier);
}
