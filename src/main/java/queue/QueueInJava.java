package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInJava {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.add(12);
        q.add(24);
        q.add(36);
        q.add(48);
        q.add(60);
        System.out.println("The queue is =>"+q);
        int num1 = q.remove();
        System.out.println("The queuue after dequeue "+q);
        int head = q.peek();
        System.out.println("The head of the queue is "+head);
    }
}
