package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_1_DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);

        int secondInteger = scan.nextInt();
        double secondDouble = scan.nextDouble();
        scan.nextLine();    // move to new line
        String secondString = scan.nextLine();
        System.out.println(i + secondInteger);
        System.out.println(d + secondDouble);
        System.out.println(s + secondString);

        scan.close();
    }
}
