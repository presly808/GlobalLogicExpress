package artcode.day9;

import java.util.Comparator;

/**
 * Created by admin on 23.07.2014.
 */
public class BinarySearch<E extends Comparable> implements ISearch<E> {

    // 1 2 3 4 5 6 7 8 9 10
    @Override
    public int search(int[] mas, int k) {
        int start = 0;
        int end = mas.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(k < mas[mid]){
                end = mid - 1;
            } else if(k > mas[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    //TODO
    @Override
    public int search(E[] mas, E key) {
        return 0;
    }

    //TODO implement method

}
