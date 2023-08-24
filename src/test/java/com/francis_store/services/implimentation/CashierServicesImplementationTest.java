package com.francis_store.services.implimentation;

import static org.junit.jupiter.api.Assertions.*;

import com.francis_store.entities.Customer;
import com.francis_store.entities.Product;
import com.francis_store.enums.ProductCategory;
import org.junit.jupiter.api.Test;

import com.francis_store.entities.Cashier;
import com.francis_store.entities.ConvenienceStore;

import java.util.HashMap;
import java.util.Map;

public class CashierServicesImplementationTest {

    @Test
    public void testDispensesReceipts() {
        ConvenienceStore.getProductMap().put("Coke", new Product("Coke",7000,30,"Blue",ProductCategory.NON_ALCOHOLIC_DRINKS));
        ConvenienceStore.getProductMap().put("Life", new Product("Life",500,50,"Green", ProductCategory.ALCOHOLIC_DRINKS));

        Customer customer = new Customer("Mr paul", "1234567890", 50_000.0);
        CustomerServicesImplementation customerServices = new CustomerServicesImplementation(customer);


        customerServices.setCustomer(customer);

        Map<String, Integer> cart = new HashMap<>();
        cart.put("Coke", 2);
        cart.put("Life", 3);
        customerServices.setCart(cart);

        Cashier cashier = new Cashier("Rita",35,"rita@gmail.com",2,"Kubwa Abuja",50_000);

        CashierServicesImplementation cashierServices = new CashierServicesImplementation();

        boolean result = cashierServices.dispensesReceipts(customerServices, cashier);

        assertTrue(result); // The customer has enough balance

        ConvenienceStore.getProductMap().clear();
    }
}
