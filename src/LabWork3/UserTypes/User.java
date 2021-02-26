package LabWork3.UserTypes;

import java.util.UUID;

public abstract class User {
    String id;
    String login;
    String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public User(String login, String password) {
        this.id = UUID.randomUUID().toString();
        this.login = login;
        this.password = password;
    }
}