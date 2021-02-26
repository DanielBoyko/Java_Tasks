package LabWork3.UserTypes;

import LabWork3.Medication;
import LabWork3.Order;

import java.util.*;
import java.util.stream.Collectors;

public class Customer extends User {
    List<Order> customerOrders = new ArrayList<>();

    public Customer(String login, String password) {
        super(login, password);
    }

    public Map<Medication, Integer> searchByTitle(HashMap<Medication, Integer> medicationsInStock, String title) {
        return medicationsInStock.entrySet()
                .stream()
                .filter(map -> map.getKey().getTitle().equals(title))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<Medication, Integer> searchByManufacturer(HashMap<Medication, Integer> medicationsInStock, String manufacturer) {
        return medicationsInStock.entrySet()
                .stream()
                .filter(map -> map.getKey().getManufacturer().equals(manufacturer))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<Medication, Integer> searchByPrice(HashMap<Medication, Integer> medicationsInStock, double price) {
        return medicationsInStock.entrySet()
                .stream()
                .filter(map -> map.getKey().getPrice() == price)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


    public Order makeOrder(HashMap<Medication, Integer> medicationsInStock, HashMap<Medication, Integer> entity) {
        if (isAllMedicationsInOrderHaveInStock(medicationsInStock, entity)) {
            HashMap<Medication, Integer> medications = new HashMap<>();

            for (Map.Entry<Medication, Integer> entry : entity.entrySet()) {
                int valueOfMedicationsInStock = medicationsInStock.get(entry.getKey());
                int valueOfEntity = entry.getValue();

                if (valueOfMedicationsInStock > valueOfEntity) {
                    medications.put(entry.getKey(), valueOfEntity);
                    medicationsInStock.put(entry.getKey(), valueOfMedicationsInStock - valueOfEntity);
                } else if (valueOfMedicationsInStock == valueOfEntity) {
                    medications.put(entry.getKey(), valueOfEntity);
                    medicationsInStock.remove(entry.getKey());
                } else {
                    medications.put(entry.getKey(), valueOfMedicationsInStock);
                    medicationsInStock.remove(entry.getKey());
                }
            }

            return new Order(login, medications);
        }
        throw  new IllegalArgumentException("You go to order a medication that is not in stock");
    }

    private boolean isAllMedicationsInOrderHaveInStock(HashMap<Medication, Integer> medicationsInStock, HashMap<Medication, Integer> entity) {
        for (Map.Entry<Medication, Integer> entry : entity.entrySet()) {
            if (!medicationsInStock.containsKey(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    public boolean deleteOrder(String orderId) {
        Order orderSearchResult = customerOrders.stream()
                .filter((order) -> order.getId().equals(orderId))
                .findFirst()
                .orElse(null);

        if (orderSearchResult != null) {
            customerOrders.remove(orderSearchResult);
            return true;
        }

        return false;
    }
}
