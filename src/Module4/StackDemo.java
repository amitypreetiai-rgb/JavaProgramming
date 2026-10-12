package Module4;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println("Stack: " + stack);

        stack.pop();
        System.out.println("After pop: " + stack);

        System.out.println("Top element using peek(): " + stack.peek());

        System.out.println("Checking if stack is empty: " + stack.isEmpty());
    }

}
