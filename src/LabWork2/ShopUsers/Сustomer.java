package LabWork2.ShopUsers;

public class Сustomer extends User {
    int expense;
    String deliveryAddress;

    public Сustomer(String login, String password, String email, String phoneNumber, int expense, String deliveryAddress) {
        super(login, password, email, phoneNumber);
        this.expense = expense;
        this.deliveryAddress = deliveryAddress;
    }

    public String toString() {
        return "Seller: login = " + login +
                ", password = " + password +
                ", email = " + email +
                ", phoneNumber = " + phoneNumber +
                ", expense = " + expense +
                ", deliveryAddress = " + deliveryAddress + ".";
    }
}