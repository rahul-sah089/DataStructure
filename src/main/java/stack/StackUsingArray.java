package stack;

public class StackUsingArray {
    static final int MAX = 1000;
    int top = -1;
    int stack[] = new int[MAX];

    boolean isEmpty() {
        return (top == -1) ? true : false;
    }

    void push(int value) {
        if (top >= MAX) {
            System.out.println("Stack OverFlow");
            return;
        }
        stack[++top] = value;
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
        }
        return stack[top--];
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
        }
        return stack[top--];
    }

    void showStackElements() {
        int temp = top;
        while (top != -1) {
            System.out.println(stack[top]);
            top--;
        }
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(12);
        stackUsingArray.push(24);
        stackUsingArray.push(36);
        stackUsingArray.push(48);
        stackUsingArray.push(60);
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.pop();
        stackUsingArray.showStackElements();
        stackUsingArray.peek();
    }

}
