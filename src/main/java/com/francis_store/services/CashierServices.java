package com.francis_store.services;

import com.francis_store.entities.Cashier;
import com.francis_store.services.implimentation.CustomerServicesImplementation;

public interface CashierServices {
    boolean dispensesReceipts(CustomerServicesImplementation customer, Cashier cashier);
}
