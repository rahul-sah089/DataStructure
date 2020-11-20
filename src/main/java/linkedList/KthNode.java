package linkedList;

public class KthNode {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void kthToLastNode(int k, Node head, int lengthOfList) {
        if (k < 1) {
            throw new IllegalArgumentException("Impossible to find less than first to last node:" + k);
        } else if (k > lengthOfList) {
            throw new IllegalArgumentException("Impossible to find greater than first to last node:" + k);
        }
        Node temp = head;
        int howFarToGo = lengthOfList - k;
        for (int i = 0; i < howFarToGo; i++) {
            temp = temp.next;
        }
        System.out.println(k + " position from the end of the list is " + temp.data);
    }

    public void kthToLastNode(int k, Node node) {
        if (k < 1) {
            throw new IllegalArgumentException("Impossible to find less than first to last node:" + k);
        }
        Node leftNode = head;
        Node rightNode = head;
        //Move the right node with Kth position
        for (int i = 0; i < k; i++) {
            rightNode = rightNode.next;
        }
        while (rightNode != null) {
            leftNode = leftNode.next;
            rightNode = rightNode.next;
        }
        System.out.println(k + " position from the end of the list is " + leftNode.data);
    }

    public int printList(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            System.out.print(temp.data + ">>");
            temp = temp.next;
        }
        System.out.println();
        return count;
    }


    public static void main(String[] args) {
        KthNode linkedList = new KthNode();
        linkedList.head = new Node(1);
        linkedList.head.next = new Node(2);
        linkedList.head.next.next = new Node(3);
        linkedList.head.next.next.next = new Node(4);
        linkedList.head.next.next.next.next = new Node(5);
        linkedList.head.next.next.next.next.next = new Node(6);
        int length = linkedList.printList(linkedList.head);
        System.out.println("Length of the linked list is " + length);
        linkedList.kthToLastNode(2, linkedList.head, length);
        linkedList.kthToLastNode(2, linkedList.head);
    }
}
