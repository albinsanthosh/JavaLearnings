package others;

/** ParanthesisBalanceChecker - program to check if a string containing round (()), square ([]), 
 * and curly ({}) brackets is balanced
 */

import java.util.Stack;

public class ParanthesisBalanceChecker {
    public static void main(String[] args) {
        String input = "{[()]}"; // Example input
        if (isBalanced(input)) {
            System.out.println("The brackets are balanced.");
        } else {
            System.out.println("The brackets are not balanced.");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Check for matching closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }

        // If the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }

    // Helper method to check if two brackets are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}