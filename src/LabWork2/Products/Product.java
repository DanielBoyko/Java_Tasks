package LabWork2.Products;

import java.util.Date;

public abstract class Product {
    protected String title;
    protected String manufacturer;
    protected Date productionDate;
    protected double price;

    public Product(String title, String manufacturer, Date productionDate, double price) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.productionDate = productionDate;
        this.price = price;
    }

    public void makePromotional(double priceMarkup) {
        this.price += priceMarkup;
    }
}
