package LabWork3.UserTypes;

import LabWork3.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    List<Order> usedOrders = new ArrayList<>();
    
    public Customer(String login, String password) {
        super(login, password);
    }
}
