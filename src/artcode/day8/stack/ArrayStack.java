package artcode.day8.stack;

/**
 * Created by admin on 23.07.2014.
 */
// _ _ _ _ _
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
        if(top < 1){
            throw new StackEmptyException("Stack is empty");
        }
        return mas[--top];
    }
}
