package artcode.day7;

import artcode.day2.Array;

import java.util.Arrays;

/**
 * Created by admin on 21.07.2014.
 */
public class TestComparable {

    public static void main(String[] args) {
        SaleMan saleMan1 = new SaleMan("Vova", 111, 1200);
        SaleMan saleMan2 = new SaleMan("Anton", 200, 1200);
        //System.out.println(saleMan1.compareTo(saleMan2));

        Object[] mas = new Object[4];
        mas[0] = saleMan2;
        mas[1] = saleMan1;
        mas[2] = new SaleMan("Anton", 1, 1200);
        mas[3] = new SaleMan("Anton", 76, 1200);


        Arrays.sort(mas);
        String res = Arrays.toString(mas);
        System.out.println(res);
    }
}
