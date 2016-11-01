package dailycoding;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_8_DictionariesAndMaps {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<>((int) (n * 1.5));
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer number = phoneBook.get(s);
            System.out.println(number == null ? "Not found" : s + "=" + number);
        }
        in.close();
    }
}
