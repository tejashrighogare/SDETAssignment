package stackClass;

import java.util.Stack;

public class StackClass {
    //Write program for stack in Java
    public static void main(String[] args) {
        Stack<Integer> stackObject = new Stack<>();
        boolean result = stackObject.empty();
        System.out.println("Is the stack empty? " + result);
        stackObject.push(78);
        stackObject.push(113);
        stackObject.push(90);
        stackObject.push(120);
        System.out.println("Elements in Stack: " + stackObject);
        stackObject.pop();
        stackObject.pop();
        System.out.println(" after pop() Elements in Stack: " + stackObject);
        result = stackObject.empty();
        System.out.println("Is the stack empty? " + result);
    }
}