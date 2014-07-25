package artcode.day11.protect;

import org.w3c.dom.NodeList;

import java.util.Queue;

/**
 * Created by admin on 25.07.2014.
 */
public class QueueImpl<T> implements IQueue<T> {

    private Node head;
    private Node tail;

    @Override
    public void enqueue(T el) {
        if(head == null) {
            head = new Node(el, null, null);
            tail = head;
        } else {
            Node newNode = new Node(el, tail, null);
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public T dequeue() {
        T ret = head.el;
        head = head.next;
        return ret;
    }

    private class Node {
        private T el;
        private Node prev;
        private Node next;

        private Node() {
        }

        private Node(T el, Node prev, Node next) {
            this.el = el;
            this.prev = prev;
            this.next = next;
        }


    }
}
