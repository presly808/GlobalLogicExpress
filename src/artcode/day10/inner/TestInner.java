package artcode.day10.inner;

/**
 * Created by admin on 24.07.2014.
 */
public class TestInner {

    public static void main(String[] args) {
        Flat flat = new Flat();
        Flat.Room room = new Flat.Room();

        Flat.Equipment equipment = flat.new Equipment();
    }
}
