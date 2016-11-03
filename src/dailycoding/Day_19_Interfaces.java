package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class Day_19_Interfaces {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }

    static interface AdvancedArithmetic {
        int divisorSum(int n);
    }

    static class Calculator implements AdvancedArithmetic {

        @Override
        public int divisorSum(int n) {
            if (n == 1) return 1;
            int sum = 1;
            for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
            return sum + n;
        }
    }
}
