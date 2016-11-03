package cracking.coding.interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class StringsMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int countDelete = 0;
        int[] chars = new int[26];
        for (char ch : first.toCharArray()) chars[ch - 97]++;
        for (char ch : second.toCharArray()) chars[ch - 97]--;
        for (int counter : chars) countDelete += Math.abs(counter);
        return countDelete;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));

    }
}
