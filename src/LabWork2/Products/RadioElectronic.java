package LabWork2.Products;

import java.util.Date;

public class RadioElectronic extends Product {
    Date warrantyPeriod;
    String typeOfElectronics;

    public RadioElectronic(String title, String manufacturer, Date productionDate, double price, String typeOfElectronics) {
        super(title, manufacturer, productionDate, price);
        this.typeOfElectronics = typeOfElectronics;
    }

    public void makePromotional(double priceMarkup, Date newWarrantyPeriod) {
        super.makePromotional(priceMarkup);
        this.warrantyPeriod = newWarrantyPeriod;
    }

    @Override
    public String toString() {
        return "RadioElectronic: title = " + title +
                ", manufacturer = " + manufacturer +
                ", productionDate = " + productionDate +
                ", price = " + price +
                ", warrantyPeriod = " + warrantyPeriod +
                ", typeOfElectronics = " + typeOfElectronics + ".";
    }
}
