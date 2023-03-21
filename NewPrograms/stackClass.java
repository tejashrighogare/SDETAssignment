package Occurances;

import java.util.Stack;

public class stackClass {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
        // pushing elements into stack
        stk.push(78);
        stk.push(113);
        stk.push(90);
        stk.push(120);
        //prints elements of the stack
        System.out.println("Elements in Stack: " + stk);

        stk.pop();
        stk.pop();
        System.out.println(" after pop() Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }
}

		
