package artcode.day11.protect;

/**
 * Created by admin on 25.07.2014.
 */
public class TestQueue {

    public static void main(String[] args) {
        QueueImpl<String> queue = new QueueImpl<String>();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

    }
}
