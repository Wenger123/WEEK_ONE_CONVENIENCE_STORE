package com.francis_store.services.implimentation;

import com.francis_store.entities.Cashier;
import com.francis_store.entities.Customer;
import com.francis_store.entities.Product;
import com.francis_store.services.CustomerServices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServicesImplementation implements CustomerServices {

    private Customer customer;
    private Map<String, Integer> cart = new HashMap<>();
    public CustomerServicesImplementation(Customer customer) {
        this.customer = customer;
    }


    public Map<String, Integer> getCart() {
        return cart;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCart(Map<String, Integer> cart) {
        this.cart = cart;
    }
@Override
public boolean addToCart(String prodName, int quantity) {
    cart.put(prodName, quantity);
    if (cart.containsKey(prodName)) {
        System.out.println("This product " + "\"" + prodName + "\"" + " has been added to customer cart");
        return true;
    } else {
        return false;
    }
}


    @Override
    public void buyProduct(CashierServicesImplementation cashier) {
        System.out.println("This customer "+ "\""+customer.getName()+"\""+" has placed an order");
    }
}
