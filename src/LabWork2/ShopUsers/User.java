package LabWork2.ShopUsers;

public abstract class User {
    protected String login;
    protected String password;
    protected String email;
    protected String phoneNumber;

    public User(String login, String password, String email, String phoneNumber) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
