package leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/ Level: Easy
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
                else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        // Iterate through string until empty
        for(char c : s.toCharArray()) {
            // Push any open parentheses onto stack
            if(c == '(' || c== '[' || c== '{')
                stack.push(c);
            // Check stack for corresponding closing parentheses, false if not valid
            else if(c== ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            else if(c== ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            else if(c== '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        // return true if no open parentheses left in stack
        return stack.empty();
    }
}