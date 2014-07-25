package artcode.day11.enums;

/**
 * Created by admin on 25.07.2014.
 */
public class TestEnum {

    public static void main(String[] args) {
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.name());
        System.out.println(Season.valueOf("WINTER"));
    }
}
