//Write program for stack in Java
package Occurances;
import java.util.Stack;
public class stackClass {
    public static void main(String[] args) {
        Stack<Integer> stackObject = new Stack<>();
        boolean result = stackObject.empty();
        System.out.println("Is the stack empty? " + result);
        // pushing elements into stack
        stackObject.push(78);
        stackObject.push(113);
        stackObject.push(90);
        stackObject.push(120);
        //prints elements of the stack
        System.out.println("Elements in Stack: " + stackObject);
        stackObject.pop();
        stackObject.pop();
        System.out.println(" after pop() Elements in Stack: " + stackObject);
        result = stackObject.empty();
        System.out.println("Is the stack empty? " + result);
    }
}

		
