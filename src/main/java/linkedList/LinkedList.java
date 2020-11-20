package linkedList;

import java.util.HashMap;
import java.util.List;

public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void makeCycle() {
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = head;
    }

    public void insertatEnd(int data) {
        Node newNode = new Node(data);
        //Insert at the head
        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        return;
    }

    //Reverse the linked list
    /*
    1) Iterative method
    1) Initialize the three pointer Head as Null, curr as Head and next as Null
    2) Iterate through the Linked List
    a) next = current->next;
       current->next = prev;
       prev = current;
       current = next;
     */

    public Node reverseLinkedList(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void insertAtNodePosition(Node exactNode, int data) {
        if (exactNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = exactNode.next;
        exactNode.next = newNode;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " >>");
            temp = temp.next;
        }
    }

    /*
    Check whether a linked list is cyclic or not
    Solution: Take two pointer both starting from the head node
    Ever time slowRunner moves one step ahead, fastRunner will moves two step ahead
    If the list has a cycle eventually lap each other
     */
    public boolean checkCycle() {
        Node slowRunner = head;
        Node fastRunner = head;
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;

            if (slowRunner == fastRunner) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head.next = second;
        second.next = third;
        list.insertAtHead(12);
        list.insertAtHead(24);
        list.insertAtHead(36);
        list.insertatEnd(48);
        list.insertatEnd(60);
        list.makeCycle();
        boolean isCycle = list.checkCycle();
        System.out.println("Is it cycle => " + isCycle);
        if (!isCycle) {
            list.printList(list.head);
        }
        list.head = list.reverseLinkedList(list.head);
        list.printList(list.head);
    }
}
