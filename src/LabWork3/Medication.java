package LabWork3;

import java.util.UUID;

public class Medication {
    String id;
    String title;
    String manufacturer;
    boolean isNeedForConfirm;
    double price;

    public String getTitle(){
        return title;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public boolean getIsNeedForConfirm(){
        return isNeedForConfirm;
    }

    public double getPrice(){
        return price;
    }

    public Medication(String title, String manufacturer, boolean isNeedForConfirm, double price) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.manufacturer = manufacturer;
        this.isNeedForConfirm = isNeedForConfirm;
        this.price = price;
    }
}
