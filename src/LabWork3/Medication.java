package LabWork3;

public class Medication {
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
        this.title = title;
        this.manufacturer = manufacturer;
        this.isNeedForConfirm = isNeedForConfirm;
        this.price = price;
    }
}
