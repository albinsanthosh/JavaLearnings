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
        
    }

    // Helper method to check if two brackets are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
}