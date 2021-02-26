package LabWork3;

import LabWork3.UserTypes.*;

import java.util.*;

public class Pharmacy {
    private List<Customer> registeredCustomers = new ArrayList<>();
    private List<Customer> registeredDoctors = new ArrayList<>();
    private List<Order> ordersAwaitingDispatch = new ArrayList<>();
    private List<Order> ordersAwaitingConfirmation = new ArrayList<>(); //orders that include medication that require a doctor's confirmation
    private HashMap<Medication, Integer> medicationsInStock = new HashMap<>();
    private User userHolder;


}
