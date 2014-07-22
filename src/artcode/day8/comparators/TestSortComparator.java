package artcode.day8.comparators;

import artcode.day2.Array;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by admin on 22.07.2014.
 */
//TODO : Implements ProductNameComparator , ProductDateComparator
public class TestSortComparator {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Notebook", 400);
        products[1] = new Product("Multivarka", 200);
        products[2] = new Product("IPhone 5s", 699);
        Arrays.sort(products, new ProductPriceComparator());

        System.out.println(Arrays.toString(products));
    }
}
