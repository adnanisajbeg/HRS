package cracking.coding.interview;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class ArraysLeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            int position = a_i - k;
            a[position < 0 ? n + position : position] = in.nextInt();
        }
        in.close();
        for (int i = 0; i < n; i ++) System.out.print(a[i] + " ");
    }
}
