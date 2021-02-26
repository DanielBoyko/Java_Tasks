package LabWork3.UserTypes;

import LabWork3.Order;

import java.util.List;

public class Doctor extends User {
    public Doctor(String login, String password) {
        super(login, password);
    }

    public List<Order> getOrdersThatNeedConfirm(List<Order> orders) {
        return orders;
    }

    public Boolean acceptConfirmationOrder(List<Order> ordersAwaitingConfirmation, String orderId) {
        Order orderSearchResult = ordersAwaitingConfirmation.stream()
                .filter((order) -> order.getId().equals(orderId))
                .findFirst()
                .orElse(null);

        if (orderSearchResult != null) {
            ordersAwaitingConfirmation.remove(orderSearchResult);
            return true;
        }

        return false;
    }
}
