package artcode.day8.comparators;

import java.util.Calendar;

/**
 * Created by admin on 22.07.2014.
 */
public class Product {

    private String name;
    private double price;
    private Calendar date;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
