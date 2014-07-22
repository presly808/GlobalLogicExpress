package artcode.day8;

/**
 * Created by admin on 22.07.2014.
 */
//TODO: StringBuilder - ?
public class Immutable {

    public static void main(String[] args) {
        String s = "";

        // String + int - String
        for (int i = 0; i < 1000; i++) {
            s = s + i; //
        }
        System.out.println();
    }
}
