package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-02
 */
public class Day_17_MoreExceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class Calculator {
        public int power(int n, int p) throws Exception {
            if (p < 0 || n < 0) throw new Exception("n and p should be non-negative");
            return (int) Math.pow(n, p);
        }
    }
}
