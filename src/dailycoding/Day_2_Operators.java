package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_2_Operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.

        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + (mealCost * tipPercent) / 100 + (taxPercent * mealCost) / 100);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
