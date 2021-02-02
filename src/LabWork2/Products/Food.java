package LabWork2.Products;

import java.util.Date;

public class Food extends Product {
    Date shelfLife;
    foodGroup group;

    public Food(String title, String manufacturer, Date productionDate, double price, Date shelfLife, foodGroup group) {
        super(title, manufacturer, productionDate, price);
        this.shelfLife = shelfLife;
        this.group = group;
    }

    public Food(String title, String manufacturer, Date productionDate, double price, Date shelfLife) {
        this(title, manufacturer, productionDate, price, shelfLife, foodGroup.OTHER);
    }

    @Override
    public String toString() {
         return "Food: title = " + title +
                ", manufacturer = " + manufacturer +
                ", productionDate = " + productionDate +
                ", price = " + price +
                ", shelfLife = " + shelfLife +
                ", group = " + group + ".";
    }
}

enum foodGroup {
    DAIRY,
    MEAT,
    GROCERIES,
    OTHER
}