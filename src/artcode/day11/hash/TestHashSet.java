package artcode.day11.hash;

import java.util.HashSet;

/**
 * Created by admin on 25.07.2014.
 */
public class TestHashSet {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();

        DogForHash dogForHash = new DogForHash("Sharic", 7, 30);
        DogForHash dogForHash1 = new DogForHash("Sharic", 7, 30);

        // contract equals hashCode

        System.out.println(dogForHash.equals(dogForHash1));
        System.out.println(dogForHash.hashCode() + " " + dogForHash1.hashCode());


    }
}
