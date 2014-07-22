package artcode.day8;

import artcode.day3.comp.Tester;

/**
 * Created by admin on 22.07.2014.
 */
/*
* 1. final class
* 2. fields(state) are final
* 3. No muttator(no setters)
* TODO : write immutable MyString(char[] value)
* */
public final class ImmutableClass {

    private final int size;
    private final Tester tester;

    public ImmutableClass(){
        size = 78;
        tester = new Tester("Bodia", 26, 1200);
    }

    public final void action(){
    }

}
