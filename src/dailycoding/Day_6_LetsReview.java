package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_6_LetsReview {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        while (n > 0) {
            String str = in.nextLine();
            String odd = " ";
            int counter = 1;
            for (char c : str.toCharArray()) {
                if (counter % 2 != 0) System.out.print(c);
                else odd += c;
                counter++;
            }
            System.out.println(odd);
            n--;
        }
    }
}
