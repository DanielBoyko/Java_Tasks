package LabWork3.Auth;

import LabWork3.UserTypes.Customer;

import java.util.List;

public class CustomerAuthentication implements Authenticatable<Customer> {
    @Override
    public Customer Login(List<Customer> registeredUsers, String login, String password) {
        return registeredUsers.stream()
                .filter((customer) -> customer.getLogin() == login & customer.getPassword() == password)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Customer Register(String login, String password, String confirmPassword) {
        return new Customer(login, password);
    }
}
