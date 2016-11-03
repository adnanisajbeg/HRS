package cracking.coding.interview;

import java.util.HashSet;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class LinkedListsDetectACycle {
    public static void main(String[] args) {
        Node head = new Node();
        head.data = 1;
        Node node1 = new Node();
        node1.data = 2;
        head.next = node1;
        Node node2 = new Node();
        node2.data = 3;
        node1.next = node2;
        node2.next = node1;

        System.out.println(hasCycle(head));


    }

    static class Node {
        int data;
        Node next;
    }

    static boolean hasCycle(Node head) {
        if(head == null) return false;
        HashSet<Integer> visited = new HashSet<>(50);
        while (head != null) {
            if (visited.contains(head.data)) return true;
            visited.add(head.data);
            head = head.next;
        }
        return false;
    }


}
