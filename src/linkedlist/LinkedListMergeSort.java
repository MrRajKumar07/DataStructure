package linkedlist;

class Node2 {
    int data;
    Node2 prev, next;

    Node2(int d) {
        this.data = d;
    }
}

public class LinkedListMergeSort {

    Node2 head;

    // Append node to end of the list
    void append(int newData) {
        Node2 newNode = new Node2(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        Node2 last = head;
        while (last.next != null)
            last = last.next;

        last.next = newNode;
        newNode.prev = last;
    }

    // Print the list from head to tail
    void printList(Node2 node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Print the list from tail to head
    void printReverse(Node2 node) {
        if (node == null) return;

        // Go to the last node
        while (node.next != null)
            node = node.next;

        // Print backwards using prev
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.prev;
        }
        System.out.println();
    }

    // Split the list into two halves
    Node2 split(Node2 node) {
        Node2 fast = node, slow = node;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        Node2 second = slow.next;
        slow.next = null;
        if (second != null)
            second.prev = null;

        return second;
    }

    // Merge two sorted doubly linked lists
    Node2 merge(Node2 first, Node2 second) {
        if (first == null) return second;
        if (second == null) return first;

        if (first.data < second.data) {
            first.next = merge(first.next, second);
            if (first.next != null)
                first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            if (second.next != null)
                second.next.prev = second;
            second.prev = null;
            return second;
        }
    }

    // Apply merge sort recursively
    Node2 mergeSort(Node2 node) {
        if (node == null || node.next == null)
            return node;

        Node2 second = split(node);

        node = mergeSort(node);
        second = mergeSort(second);

        return merge(node, second);
    }

    // Main method to test functionality
    public static void main(String[] args) {
        LinkedListMergeSort list = new LinkedListMergeSort();
        list.append(4);
        list.append(2);
        list.append(8);
        list.append(5);
        list.append(1);

        System.out.println("Original list:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted list:");
        list.printList(list.head);

        System.out.println("Reverse of sorted list:");
        list.printReverse(list.head);
    }
}
