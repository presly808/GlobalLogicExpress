package artcode.day9;

import artcode.day2.Array;
import artcode.day9.exceptions.TooLongArrayException;

import java.util.Arrays;

/**
 * Created by admin on 23.07.2014.
 */
public class TestBinarySearch {
    public static void main(String[] args) {
        ISearch search = new BinarySearch();
        ISearch<String> search1 = new BinarySearch<String>();

        int[] mas = createMas(100000000);

        long start = System.currentTimeMillis();
        int index = search.search(mas, mas.length-1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        try {
            search(mas, mas.length-1);
        } catch (TooLongArrayException e) {

        } catch (Exception e){

        }
        end = System.currentTimeMillis();
        System.out.println(end - start);


    }

    private static int search(int[] mas, int key) throws TooLongArrayException {
        if(mas.length > 100000){
            throw new TooLongArrayException("Dont play with me");
        }

        for(int i = 0; i < mas.length; i++){
            if(mas[i] == key){
                return i;
            }
        }
        return -1;
    }

    private static int[] createMas(int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i;
        }

        return mas;
    }
}
