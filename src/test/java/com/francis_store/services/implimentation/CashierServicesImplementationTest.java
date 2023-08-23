package com.francis_store.services.implimentation;

import com.francis_store.entities.Cashier;
import com.francis_store.entities.Customer;
import com.francis_store.services.CashierServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashierServicesImplementationTest {
    Customer customer1 = new Customer("Mr Francis", "08056465747", 50_000);
    CustomerServicesImplementation customerServicesImplementation = new CustomerServicesImplementation(customer1);
    Cashier cashier = new Cashier("Rita", 28, "ik2yahoo.com", 5, "5 link road, benin", 150_000);
    CashierServicesImplementation cashierServicesImplementation = new CashierServicesImplementation();

    double totalCost ;


    @Test
    void dispensesReceipts() {
        assertTrue(cashierServicesImplementation.dispensesReceipts(customerServicesImplementation,cashier));
    }
}