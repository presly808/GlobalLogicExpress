package artcode.day10.recursive_data_str;

import artcode.day8.stack.IStack;

/**
 * Created by admin on 24.07.2014.
 */
public class LinkedStack<E> implements IStack<E> {

    private Node top;

    @Override
    public void push(E value) {
        if(top == null){
            top = new Node(value, null);
        } else {
            Node newNode = new Node(value, top);
            top = newNode;
        }
    }

    @Override
    public E pop() {
        Node temp = top;
        top = top.next;
        return temp.value;
    }

    // Inner class, non-static, depends on outer
    private class Node {

        private E value;
        private Node next;

        Node() {
        }

        Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}


