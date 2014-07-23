package artcode.day9.gen;

/**
 * Created by admin on 23.07.2014.
 */
// Cant create instance of generic
// static x-> generics
// class generic, method generic
public class Pair <T, E> {

    private T first;
    private E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }



}
