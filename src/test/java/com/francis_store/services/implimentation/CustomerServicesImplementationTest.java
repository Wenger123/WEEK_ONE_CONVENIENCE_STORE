package com.francis_store.services.implimentation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.francis_store.entities.Customer;

public class CustomerServicesImplementationTest {

    @Test
    public void testAddToCart() {
        Customer customer = new Customer("Frank", "08131087884", 100_000.0); // Assuming constructor

        CustomerServicesImplementation customerServices = new CustomerServicesImplementation(customer);
        boolean result = customerServices.addToCart("Coke", 2);

        assertTrue(result);
        assertEquals(2, customerServices.getCart().get("Coke"));
    }

    @Test
    public void testBuyProduct() {
        Customer customer = new Customer("Frank", "08131087884", 100.0); // Assuming constructor
        CashierServicesImplementation cashierServices = new CashierServicesImplementation(); // Assuming constructor

        CustomerServicesImplementation customerServices = new CustomerServicesImplementation(customer);
        customerServices.buyProduct(cashierServices);
        // Assuming you want to verify a certain message or behavior after buying a product
    }
}
