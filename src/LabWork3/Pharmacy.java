package LabWork3;

import LabWork3.UserTypes.*;

import java.util.*;

public class Pharmacy {
    private List<Customer> registeredCustomers = new ArrayList<>();
    private List<Customer> registeredDoctors = new ArrayList<>();
    //orders that don't await confirmation and will be dispatched 6 hours after the order
    private List<Order> ordersAwaitingDispatch = new ArrayList<>();
    //orders that include medication that require a doctor's confirmation
    private List<Order> ordersAwaitingConfirmation = new ArrayList<>();
    private HashMap<Medication, Integer> medicationsInStock = new HashMap<>();
    private User userHolder;
}
