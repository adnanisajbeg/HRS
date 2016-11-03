package cracking.coding.interview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class HashTablesRansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<String, Integer> magazine = new HashMap<>(50);
        for(int magazine_i = 0; magazine_i < m; magazine_i++){
            String next = in.next();
            Integer counter = magazine.get(next);
            if (counter == null) magazine.put(next, 1);
            else magazine.put(next, ++counter);
        }
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String next = in.next();
            Integer counter = magazine.get(next);
            if (counter == null || counter == 0) {
                System.out.println("No");
                in.close();
                return;
            }

            magazine.put(next, --counter);
        }

        System.out.println("Yes");
    }
}
