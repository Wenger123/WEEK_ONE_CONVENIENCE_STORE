package com.francis_store;

import com.francis_store.entities.*;
import com.francis_store.enums.ProductCategory;
import com.francis_store.services.CashierServices;
import com.francis_store.services.CustomerServices;
import com.francis_store.services.implimentation.CashierServicesImplementation;
import com.francis_store.services.implimentation.CustomerServicesImplementation;
import com.francis_store.services.implimentation.ManagersServicesImplementation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager("Manager Office","Anthony",35,"anthony",1,
                                      "No Buhari Street Garki Abuja",100_000);
        System.out.println(manager.getName() + " : " + manager.getSalary());


       ManagersServicesImplementation implementation = new ManagersServicesImplementation();


        System.out.println("  ");
        implementation.hireCashier("Rita",35,"rita@gmail.com",2,"Kubwa Abuja",50_000);
        implementation.hireCashier("Cynthia",30,"cynthia@gmail.com",3,"Jabi Abuja",55_000);
        implementation.hireCashier("Gift",25,"gift@gmail.com",4,"asokoro Abuja",50_000);


        Cashier cashier1  = new Cashier("Cynthia",30,"cynthia@gmail.com",3,"Jabi Abuja",55_000);
        Cashier cashier2 = new Cashier("Gift",25,"gift@gmail.com",4,"asokoro Abuja",50_000);


        System.out.println("  ");
        System.out.println(ConvenienceStore.getCashierList());
        System.out.println(ConvenienceStore.getCashierMap());


        System.out.println("  ");
        implementation.sackCashier("Rita");
        implementation.sackCashier("Rita");
        implementation.sackCashier("Rita");


        System.out.println("  ");
        System.out.println(ConvenienceStore.getCashierList());
        System.out.println(ConvenienceStore.getCashierMap());


        System.out.println("  ");
        implementation.sackCashier("Rita");


        System.out.println("  ");
        implementation.sackCashier("Agnes");


        System.out.println("  ");
        implementation.addProduct("Life",500,50,"Green", ProductCategory.ALCOHOLIC_DRINKS);
        implementation.addProduct("Coke",7000,30,"Blue",ProductCategory.NON_ALCOHOLIC_DRINKS);
        implementation.addProduct("Eyeshadow",5000,35,"milk",ProductCategory.COSMETICS);
        implementation.addProduct("Hot Chocolate",3500,20,"Gray",ProductCategory.BEVERAGES);
        implementation.addProduct("Bread",900,15,"Blink",ProductCategory.BAKERIES);
        implementation.addProduct("Crayfish",350,20,"Gray",ProductCategory.SEAFOODS);

        System.out.println(" ");
        System.out.println(ConvenienceStore.productList);
        System.out.println(ConvenienceStore.getProductMap());


        System.out.println("  ");
        implementation.removeProduct("Life");


        System.out.println("  ");
        System.out.println(ConvenienceStore.productList);
        System.out.println(ConvenienceStore.getProductMap());


        System.out.println("  ");
        ConvenienceStore store = new ConvenienceStore("Francis Super Market","N0 10 Lord lugard road Garki Area 11 Abuja",
                                                      "francistore@gmail.com");

        System.out.println("  ");
        System.out.println(store.getName());


        System.out.println("  ");
        System.out.println(store.getAddress());


        System.out.println("  ");
        System.out.println(store.getEmail());


        Customer customer1 = new Customer("Mr Francis", "08056465747", 50_000);
        Customer customer2 = new Customer("Chief", "0814537219",100_000);


        CustomerServicesImplementation customerImplementation1 = new CustomerServicesImplementation(customer1);


        System.out.println("  ");
        customerImplementation1.addToCart("Coke", 5);
        customerImplementation1.addToCart("Bread", 2);


        System.out.println("  ");
        System.out.println(customerImplementation1.getCart());


        CashierServicesImplementation cashierService1 = new CashierServicesImplementation();


        System.out.println("  ");
        customerImplementation1.buyProduct(cashierService1);


        System.out.println("  ");
        cashierService1.dispensesReceipts(customerImplementation1,cashier1);


        CustomerServicesImplementation customerImplementation2 = new CustomerServicesImplementation(customer2);


        System.out.println("  ");
        customerImplementation2.addToCart("Hot Chocolate", 8);
        customerImplementation2.addToCart("Eyeshadow", 4);


        System.out.println("  ");
        System.out.println(customerImplementation2.getCart());


        CashierServicesImplementation cashierService2 = new CashierServicesImplementation();


        System.out.println("  ");
        customerImplementation2.buyProduct(cashierService2);


        System.out.println("  ");
        cashierService2.dispensesReceipts(customerImplementation2,cashier2);












    }
}
