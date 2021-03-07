package LabWork3.Auth;

import LabWork3.UserTypes.Customer;

import java.util.List;

public class CustomerAuthentication implements Authenticatable<Customer> {
    @Override
    public Customer Login(List<Customer> registeredСustomers, String login, String password) {
        return registeredСustomers.stream()
                .filter((customer) -> customer.getLogin() == login & customer.getPassword() == password)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Customer Register(String login, String password, String confirmPassword) {
        if(Validation.isEmptyOrWhiteSpace(login)){
            throw new IllegalArgumentException("Invalid login");
        }

        if(Validation.isEmptyOrWhiteSpace(password)){
            throw new IllegalArgumentException("Invalid password");
        }

        if(!password.equals(confirmPassword)){
            throw new IllegalArgumentException("Passwords must match.");
        }

        return new Customer(login, password);
    }
}
