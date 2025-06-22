package linkedlist;

class Node1 {
    int data;
    Node1 next;
    Node1(int d) {
        data = d;
        next = null;
    }
}
public class LinkedList {
    Node head;
    
    void add(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        
    }

    void segregateEvenOdd() {
        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;
        Node current = head;

        while (current != null) {
            int val = current.data;

            if (val % 2 == 0) {
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else {
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }

            current = current.next;
        }

        if (evenStart == null || oddStart == null) {
            return;
        }
        evenEnd.next = oddStart;
        oddEnd.next = null;

        head = evenStart;
    }
    
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(17);
        list.add(15);
        list.add(8);
        list.add(12);
        list.add(10);
        list.add(5);
        list.add(4);

        System.out.println("Original List:");
        list.printList();

        list.segregateEvenOdd();

        System.out.println("Modified List (Even before Odd):");
        list.printList();
    }
}