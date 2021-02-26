package LabWork3.Auth;

import LabWork3.UserTypes.Customer;
import LabWork3.UserTypes.User;

import java.util.List;

public interface Authenticatable <T extends User> {
    public T Login(List<T> registeredUsers, String login, String password);
    public T Register(String login, String password, String confirmPassword);
}
