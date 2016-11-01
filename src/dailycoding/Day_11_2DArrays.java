package dailycoding;

import java.util.Scanner;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-01
 */
public class Day_11_2DArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = 0;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if (i > 1 && j > 1) {
                    int hourglass = arr[i - 2][j - 2] + arr[i - 2][j - 1] + arr[i - 2][j] + arr[i - 2][j] + arr[i - 1][j - 1] + arr[i][j - 2] + arr[i][j - 1] + arr[i][j];
                    if (hourglass > max) max = hourglass;
                }
            }
        }

        System.out.println(max);
    }
}
