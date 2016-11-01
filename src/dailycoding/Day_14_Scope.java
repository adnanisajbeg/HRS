package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_14_Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        in.close();

        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }

    private static class Difference {
        int[] elements;
        int maximumDifference;

        Difference(int[] elements) {
            this.elements = elements;

        }

        void computeDifference() {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int element : elements) {
                if (element < min)
                    min = element;
                if (element > max)
                    max = element;
            }

            maximumDifference = Math.abs(max - min);
        }
    }
}
