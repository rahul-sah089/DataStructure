package linkedList;

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

    public void insertatEnd(int data){
        Node newNode = new Node(data);
        //Insert at the head
        Node tempNode =  head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        return;
    }

    public void insertAtNodePosition(Node exactNode,int data){
        if(exactNode == null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = exactNode.next;
        exactNode.next = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " >>");
            temp = temp.next;
        }
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
        list.printList();
    }
}
