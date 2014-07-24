package artcode.day10.inner;

/**
 * Created by admin on 24.07.2014.
 */
public class Flat {

    private Room hall;
    private Room bath;

    public Flat() {
        hall = new Room();
    }

    //nested class, static
    public static class Room {
        private double square;
        private String color;
        private Flat flat;
    }

    //inner, non-static
    public class Equipment{
        private double price;
        private String type;
    }

}
