package artcode.day9.exceptions;

import artcode.day9.gen.Pair;

/**
 * Created by admin on 23.07.2014.
 */
public class TestGenerics {
    public static void main(String[] args) {
        Pair<String, Integer> pair =
                new Pair<String, Integer>("simple",12);
        TestGenerics.<String>test(new String[]{"one","two"});
    }

    private static <N> N test(N[] mas){
        return mas[0];
    }

}
