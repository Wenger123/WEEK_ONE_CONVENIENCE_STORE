package com.francis_store.services.implimentation;
import com.francis_store.entities.Cashier;
import com.francis_store.entities.ConvenienceStore;
import com.francis_store.services.CashierServices;

public class CashierServicesImplementation implements CashierServices {

    @Override
    public boolean dispensesReceipts(CustomerServicesImplementation customer, Cashier cashier) {
        double totalCost = 0;
        System.out.println("............................................................................");
        System.out.println("............................................................................");
        System.out.println("Receipt for : " + customer.getCustomer().getName()+"           "+ customer.getCustomer().getPhoneNumber());
        for (String key : customer.getCart().keySet()){
            System.out.println(key + "...................Price : "+ ConvenienceStore.getProductMap().get(key).getPrice()+"....................Quantity: "+ customer.getCart().get(key));
            totalCost += ConvenienceStore.getProductMap().get(key).getPrice() * customer.getCart().get(key);
        }
        System.out.println("Total Amount : " + totalCost);
        System.out.println("Your Balance : " + (customer.getCustomer().getWallet()-totalCost));
        System.out.println("Issued by : " + cashier.getName() +"........Cashier id No: "+ cashier.getId());
        System.out.println("Thank for patronizing our store, see you next time.");
        System.out.println("............................................................................");
        System.out.println("............................................................................");

        if (customer.getCustomer().getWallet() > totalCost){
            return true;
        }
        else
            return false;

    }
}
