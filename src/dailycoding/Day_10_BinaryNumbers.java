package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_10_BinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int max = 0;
        int counter = 0;
        while (number > 0) {
            int reminder = number % 2;
            if (reminder == 1) {
                counter++;
                if (counter > max) max = counter;
            }
            else counter = 0;

            number /= 2;
        }
        System.out.println(max);
    }
}
