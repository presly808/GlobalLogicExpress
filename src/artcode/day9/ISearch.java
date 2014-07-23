package artcode.day9;

/**
 * Created by admin on 23.07.2014.
 */
public interface ISearch <T> {

    int search(int[] mas, int k);

    int search(T[] mas, T key);
}
