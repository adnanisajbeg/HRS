package cracking.coding.interview;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-12-12
 */
public class HeapsFindTheRunningMedian {
    private static Comparator<Integer> COMPARATOR = (Integer first, Integer second) -> second - first;
    private static PriorityQueue<Integer> LOWER_PRIORITY_QUEUE = new PriorityQueue<>(10000, COMPARATOR);
    private static PriorityQueue<Integer> HIGHER_PRIORITY_QUEUE = new PriorityQueue<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        calculateMedian(a);
    }

    private static void calculateMedian(int[] array) {
        for (int element : array) {
            if (LOWER_PRIORITY_QUEUE.isEmpty()) {
                LOWER_PRIORITY_QUEUE.add(element);
            } else {
                addElement(element);
            }
            System.out.println(calculateCurrentMedian());
        }
    }

    private static float calculateCurrentMedian() {
        if (LOWER_PRIORITY_QUEUE.size() == HIGHER_PRIORITY_QUEUE.size()) {
            return (LOWER_PRIORITY_QUEUE.peek() + HIGHER_PRIORITY_QUEUE.peek()) / 2.0f;
        }
        return (float) LOWER_PRIORITY_QUEUE.peek();
    }

    private static void addElement(int element) {
        if (LOWER_PRIORITY_QUEUE.size() > HIGHER_PRIORITY_QUEUE.size()) {
            if (LOWER_PRIORITY_QUEUE.peek() > element) {
                moveToHigher(element);
            } else {
                HIGHER_PRIORITY_QUEUE.add(element);
            }
        } else {
            if (!HIGHER_PRIORITY_QUEUE.isEmpty() && HIGHER_PRIORITY_QUEUE.peek() >= element) {
                LOWER_PRIORITY_QUEUE.add(element);
            } else {
                moveToLower(element);
            }
        }
    }

    private static void moveToLower(int element) {
        LOWER_PRIORITY_QUEUE.add(HIGHER_PRIORITY_QUEUE.poll());
        HIGHER_PRIORITY_QUEUE.offer(element);
    }

    private static void moveToHigher(int element) {
        HIGHER_PRIORITY_QUEUE.add(LOWER_PRIORITY_QUEUE.poll());
        LOWER_PRIORITY_QUEUE.add(element);
    }
}
