package artcode.day11.enums;

/**
 * Created by admin on 25.07.2014.
 */

public enum Season { // extends Enum
    WINTER("w", 100), SPRING("s", 90),
    SUMMER("s",300), AUTUMN("au",30);

    private final String desc;
    private final int days;
    /*
    * public static final Season WINTER = new Season();
    * */

    private Season(String desc, int days) {
        this.desc = desc;
        this.days = days;
    }


}
