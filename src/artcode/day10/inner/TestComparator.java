package artcode.day10.inner;

import artcode.day2.Array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by admin on 24.07.2014.
 */
public class TestComparator {


    public static void main(String[] args) {

        Integer[] mas = {45,23,12,55,1,3,67,98};

        //Anonymous class
        Comparator<Integer> comp = new Comparator<Integer>(){
            private String name;
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        Arrays.sort(mas, comp);

        System.out.println(Arrays.toString(mas));
    }
}
