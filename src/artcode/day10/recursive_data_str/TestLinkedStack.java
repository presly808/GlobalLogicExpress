package artcode.day10.recursive_data_str;

import artcode.day8.stack.ArrayStack;
import artcode.day8.stack.IStack;

/**
 * Created by admin on 24.07.2014.
 */
public class TestLinkedStack {

    public static void main(String[] args) {
        IStack<String> stack = new LinkedStack<String>();
        stack.push("Serhii");
        stack.push("Anton");
        stack.push("Valentin");
        stack.push("Olexiy");
        stack.push("Valeriy");
        stack.push("Oksana");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
