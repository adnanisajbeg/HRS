package cracking.coding.interview;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: Adnan Isajbegovic
 * @Created: 2016-11-03
 */
public class StacksBalancedBrackets {
    public static boolean isBalanced(String expression) {
        if (expression == null || expression.isEmpty() || expression.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            switch(ch) {
                case '(':
                    stack.push('('); break;
                case '[':
                    stack.push('['); break;
                case '{':
                    stack.push('{'); break;
                default:
                    if (stack.isEmpty()) return false;
                    char pop = stack.pop();
                    if (ch - pop > 2) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
