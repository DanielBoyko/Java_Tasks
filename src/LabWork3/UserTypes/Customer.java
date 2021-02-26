package LabWork3.UserTypes;

import LabWork3.Medication;
import LabWork3.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends User {
    List<Order> usedOrders = new ArrayList<>();

    public Customer(String login, String password) {
        super(login, password);
    }

    public HashMap<Medication, Integer> searchByTitle(HashMap<Medication, Integer> medicationsInStock , String title) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().getTitle().equals(title)) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }

    public HashMap<Medication, Integer> searchByManufacturer(HashMap<Medication, Integer> medicationsInStock ,String manufacturer) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().getManufacturer().equals(manufacturer)) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }

    public HashMap<Medication, Integer> searchByPrice(HashMap<Medication, Integer> medicationsInStock ,double price) {
        HashMap<Medication, Integer> searchResult = new HashMap<>();
        for (Map.Entry<Medication, Integer> entry : medicationsInStock.entrySet()) {
            if (entry.getKey().getPrice() == price) {
                searchResult.put(entry.getKey(), entry.getValue());
            }
        }
        return searchResult;
    }
}
