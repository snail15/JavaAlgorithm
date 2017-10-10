package LeetCode;

import java.util.Stack;

/**
 * Created by sunginjung on 10/1/17.
 */
public class ValidParenthesis {

    public static void main(String[] args) {

        System.out.println(isValidParen("sjkj()kjkjkj[]"));

    }

    static boolean isValidParen(String s){

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '('){
                stack.push(')');

            } else if (c == '{'){
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            else if (c == '}' || c == ']' || c == ')' )  {
                if(stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }

        }
        return stack.isEmpty();

//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.next();
//        int myInt = scanner.nextInt();
//        scanner.close();
//
//        System.out.println("myString is: " + myString);
//        System.out.println("myInt is: " + myInt);

    }
}
