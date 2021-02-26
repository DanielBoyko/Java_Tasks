package LabWork3.UserTypes;

import LabWork3.Medication;
import LabWork3.Order;

import java.util.HashMap;
import java.util.List;

public class Doctor extends User {
    public Doctor(String login, String password) {
        super(login, password);
    }

    public List<Order> getOrdersThatNeedConfirm(List<Order> orders) {
        return orders;
    }

    public Boolean acceptConfirmationOrder(List<Order> orders, int orderId) {
        Order orderSearchResult = orders.stream()
                .filter((order) -> order.getId() == orderId)
                .findFirst()
                .orElse(null);

        if (orderSearchResult != null) {
            orders.remove(orderSearchResult);
            return true;
        }
        return false;
    }
}
