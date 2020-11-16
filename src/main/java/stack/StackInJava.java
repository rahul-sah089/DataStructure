package stack;

import java.util.Stack;

public class StackInJava {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(12);
        stk.push(36);
        stk.push(48);
        stk.push(60);
        stk.push(72);
        int value = stk.pop();
        System.out.println(value);
        System.out.println(stk.peek());
    }
}
