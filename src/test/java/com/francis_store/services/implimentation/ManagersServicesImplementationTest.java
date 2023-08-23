package com.francis_store.services.implimentation;

import com.francis_store.services.ManagerServices;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagersServicesImplementationTest {
    ManagerServices manager = new ManagersServicesImplementation();

    @Test
    void hireCashier() {
        /*
         * This is hiring of cashier, so it is following the method which said you can hire only once.
         */
       boolean result = manager.hireCashier("Rita",35,"rita@gmail.com",2,"Kubwa Abuja",50_000);
        assertTrue(result);

        /*
         * This is rehiring of cashier, so it is not following the method which said you can hire only once.
         */
        assertFalse(manager.hireCashier("Rita",35,"rita@gmail.com",2,"Kubwa Abuja",50_000));



    }

    @Test
    void sackCashier() {
        boolean result = manager.sackCashier("Rita");
        assertTrue(result);

        assertFalse(manager.sackCashier("Rita"));
    }

    @Test
    void addProduct() {
    }

    @Test
    void removeProduct() {
    }
}