package artcode.day8.stack;

/**
 * Created by admin on 23.07.2014.
 */
public class ArrayStack<E> implements IStack<E> {

    private E[] mas;
    private int top;

    public ArrayStack() {
        mas = (E[]) new Object[10];
    }

    @Override
    public void push(E value) {
        mas[top++] = value;
    }

    @Override
    public E pop() {
        return mas[--top];
    }
}
