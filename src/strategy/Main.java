package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> orders = new ArrayList<>();
        //Discount types:  Sale, Discount, and Liquidation
        orders.add(new Discount("William Walters", 75.34));
        orders.add(new Sale("Susan Smothers", 24.12));
        orders.add(new Liquidation("Jessica Johnson", 273.93));
        orders.add(new Discount("Richard Ricardo", 171.42));

        double total = 0;
        for (Customer o : orders) {
            System.out.println(o.getCustomerName() + " " + o.getBillAmount());
            total += o.getBillAmount();
        }
        System.out.println("Total:    " + total);

    }
}
