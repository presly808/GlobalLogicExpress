package artcode.day7;

import artcode.day3.comp.Worker;

/**
 * Created by admin on 21.07.2014.
 */
public class TestEquals {

    //TODO: test reflexivity, symmetry, transitivity - equals
    public static void main(String[] args) {

        String s = "some";

        String s1 = new String("some");

        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        SaleMan saleMan1 = new SaleMan("Vova", 2, 1200);
        SaleMan saleMan2 = new SaleMan("Vova", 2, 1200);

        System.out.println(saleMan1.equals(saleMan2));

    }

    public static void testTernary(){
        int a = 89;
        int b = 200;
        int c = a < b ? a*a : b-a;
        if(a<b){
            return;
        } else {
            return;
        }

    }


}
