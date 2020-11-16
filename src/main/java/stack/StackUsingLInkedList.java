package stack;

public class StackUsingLInkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public int pop() {
        Node tempNode = head;
        int val = head.data;
        tempNode = tempNode.next;
        return val;
    }

    public int peek() {
        return head.data;
    }

    public void print() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.data + ">>");
        }
    }


}
