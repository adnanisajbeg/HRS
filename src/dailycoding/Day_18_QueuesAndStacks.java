package dailycoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-02
 */
public class Day_18_QueuesAndStacks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        char[] s = input.toCharArray();
        Solution p = new Solution();
        for(char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    boolean isPalindrome = true;


    static class Solution {
        private Stack<Character> stack = new Stack<>();
        private Queue<Character> queue = new LinkedList<>();

        public void pushCharacter(char ch) {
            stack.push(ch);
        }

        public void enqueueCharacter(char ch) {
            queue.add(ch);
        }

        public char popCharacter() {
            return stack.pop();
        }

        public char dequeueCharacter() {
            return queue.remove();
        }
    }
}
