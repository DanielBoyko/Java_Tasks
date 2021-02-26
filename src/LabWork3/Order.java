package LabWork3;

import java.util.HashMap;

public class Order {
    int id;
    String userLogin;
    HashMap<Medication,Integer> medications = new HashMap<>();

    public int getId(){
        return id;
    }

    public String getUserLogin(){
        return userLogin;
    }
}
