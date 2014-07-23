package artcode.day9.exceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by admin on 23.07.2014.
 */
public class TestExcep {
    public static void main(String[] args) throws ParseException {


        System.out.println("Before");
//        int i = 78 / 0; // Unchecked ex
//        String s = null;
//        s.length();

        a();
        System.out.println("After");

    }

    private static void a() throws ParseException {
        b();
    }

    private static void b() throws ParseException {
        c();
        //
    }

    // Ctrl + Shift + Up
    private static void c() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        try {
            sdf.parse("kkh");
            System.out.println("after parse");
        } catch (ParseException pe){
            System.out.println("In catch block");
        }
        System.out.println("after try catch");

    }
}
