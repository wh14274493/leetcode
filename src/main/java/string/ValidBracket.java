package string;

import java.util.Stack;

/**
 * @author wang hao
 * @created 2019/12/28 18:03
 * @contact 14274493
 */
public class ValidBracket {

    public static boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        if ("".equals(s)) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            }
            if (c == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            }
            if (c == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = ")";
        System.out.println(isValid(s));
    }
}
