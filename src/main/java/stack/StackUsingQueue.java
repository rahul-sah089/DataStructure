package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int i){
       q1.add(i);
    }

    int pop(){
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        return q2.remove();
    }



    public static void main(String[] args) {
        System.out.println("Implementing stacking using queue");
        Stack<Integer> s1 = new Stack<Integer>();
        StackUsingQueue stacks = new StackUsingQueue();
        stacks.push(12);
        s1.push(12);


        stacks.push(24);
        s1.push(24);

        stacks.push(36);
        s1.push(36);

        stacks.push(48);
        s1.push(48);

        System.out.println(stacks.pop());
        //System.out.println(s1.pop());


    }
}
