package LabWork2.Products;

import java.util.Date;

public class Product {
    String title;
    String manufacturer;
    Date productionDate;
    double price;

    public Product(String title, String manufacturer, Date productionDate, double price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void makePromotional(double priceMarkup) {
        this.price += priceMarkup;
    }

    @Override
    public String toString() {
        return "Product: title = " + title +
                ", manufacturer = " + manufacturer +
                ", productionDate = " + productionDate +
                ", price = " + price + ".";
    }
}
