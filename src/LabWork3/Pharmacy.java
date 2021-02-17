package LabWork3;

import LabWork3.UserTypes.*;

import java.util.*;

public class Pharmacy {
    private List<Customer> registeredUsers = new ArrayList<>();
    private List<Doctor> registeredDoctors = new ArrayList<>();
    private List<Order> ordersAwaitingDispatch = new ArrayList<>();
    private List<Order> ordersAwaitingConfirmation = new ArrayList<>(); //orders that include medication that require a doctor's confirmation
    private HashMap<Medication, Integer> medicationsInStock = new HashMap<>();
    private User authorizedUser;

    public void start() {
        Scanner in = new Scanner(System.in);
        int switch_auth = Integer.parseInt(in.next());
        switch (switch_auth) {
            case 1:

        }
    }

    public User authorization() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input login:");
        String login = in.next();
        System.out.println("Input password:");
        String password = in.next();
        return new Doctor("d", "d");
    }

    public HashMap<Medication, Integer> searchByTitle(String title) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().title == title) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }

    public HashMap<Medication, Integer> searchByManufacturer(String manufacturer) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().manufacturer == manufacturer) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }

    public HashMap<Medication, Integer> searchByPrice(double price) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().price == price) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }

}
