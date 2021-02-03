package LabWork2.StoreUsers;

import java.util.Date;

public class Seller extends User {
    int numberSubdivision;
    Date dateOfEmployment;
    double tradingBonuses;

    public Seller(String login, String password, String email, String phoneNumber,
                  int numberSubdivision, Date dateOfEmployment, double tradingBonuses) {
        super(login, password, email, phoneNumber);
        this.numberSubdivision = numberSubdivision;
        this.dateOfEmployment = dateOfEmployment;
        this.tradingBonuses = tradingBonuses;
    }

    public Seller(String login, String password, String email, String phoneNumber,
                  int numberSubdivision, Date dateOfEmployment) {
        this(login, password, email, phoneNumber, numberSubdivision, dateOfEmployment, 0);
    }

    public void transfer(int numberSubdivision, double tradingBonuses) {
        this.numberSubdivision = numberSubdivision;
        this.tradingBonuses = tradingBonuses;
    }

    public void transfer(int numberSubdivision) {
        transfer(numberSubdivision, 0);
    }

    @Override
    public String toString() {
        return "Seller: login = " + login +
                ", password = " + password +
                ", email = " + email +
                ", phoneNumber = " + phoneNumber +
                ", numberSubdivision = " + numberSubdivision +
                ", dateOfEmployment = " + dateOfEmployment +
                ", tradingBonuses = " + tradingBonuses + ".";
    }
}
