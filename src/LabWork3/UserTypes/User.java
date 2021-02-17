package LabWork3.UserTypes;

public abstract class User {
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean validLogicPass(String login, String password) {
        return login == this.login & password == this.password;
    }
}