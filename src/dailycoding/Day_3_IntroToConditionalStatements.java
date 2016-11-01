package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_3_IntroToConditionalStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        System.out.println(n % 2 == 0 ? n >= 2 && n <= 5 ? "Not Weird" : n <= 20 ? "Weird" : "Not Weird" : "Weird");
    }
}
