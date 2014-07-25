package artcode.day11.protect;

/**
 * Created by admin on 25.07.2014.
 */
public interface IQueue <E> {

    void enqueue(E el);
    E dequeue();

}
