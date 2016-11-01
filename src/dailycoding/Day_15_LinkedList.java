package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_15_LinkedList {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Node head = null;
        int N = in.nextInt();

        while (N-- > 0) {
            int ele = in.nextInt();
            head = insert(head, ele);
        }

        display(head);
        in.close();
    }

    static class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
            next = null;
        }
    }

    public static Node insert(Node head, int data) {
        if (head == null) return new Node(data);
        Node current = head;
        while (current.next != null) current = current.next;
        current.next = new Node(data);
        return head;
    }

    public static void display (Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }
}
