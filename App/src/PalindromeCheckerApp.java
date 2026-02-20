//Version 6.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Hardcoded Palindrome (Optimized Check)
//Use Case 3: Palindrome Check Using String Reverse
//Use Case 4: Character Array Based Palindrome Check
//Use Case 5: Stack-Based Palindrome Checker
//Use Case 6: Queue + Stack Based Palindrome Check
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("=== Welcome to Palindrome Checker Management System ===");
        System.out.println();
        // UC2: Hardcoded Palindrome (Using Index Comparison)
        String originalUC2 = "madam";
        boolean isPalUC2 = true;
        for (int i = 0; i < originalUC2.length() / 2; i++) {
            if (originalUC2.charAt(i) != originalUC2.charAt(originalUC2.length() - 1 - i)) {
                isPalUC2 = false;
                break;
            }
        }
        System.out.println("UC2 (Optimized): Is '" + originalUC2 + "' a palindrome? " + isPalUC2);
        // UC3: Palindrome Check Using String Reverse (Concatenation)
        String originalUC3 = "radar";
        String reversedUC3 = "";
        for (int i = originalUC3.length() - 1; i >= 0; i--) {
            reversedUC3 = reversedUC3 + originalUC3.charAt(i);
        }
        System.out.println("UC3 (Reverse): Is '" + originalUC3 + "' a palindrome? " + originalUC3.equals(reversedUC3));
        // UC4: Character Array Based Palindrome Check
        String inputUC4 = "deified";
        char[] charArray = inputUC4.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        boolean isPalUC4 = true;
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalUC4 = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("UC4 (Char Array): Is '" + inputUC4 + "' a palindrome? " + isPalUC4);
        //  UC5: Stack-Based Palindrome Checker
        String inputUC5 = "noon";
        Stack<Character> stackUC5 = new Stack<>();
        for (int i = 0; i < inputUC5.length(); i++) {
            stackUC5.push(inputUC5.charAt(i));
        }
        String reversedUC5 = "";
        while (!stackUC5.isEmpty()) {
            reversedUC5 += stackUC5.pop();
        }
        System.out.println("UC5 (Stack Only): Is '" + inputUC5 + "' a palindrome? " + inputUC5.equals(reversedUC5));
        //  UC6: Queue + Stack Based Palindrome Check
        String inputUC6 = "racecar";
        Stack<Character> stackUC6 = new Stack<>();
        Queue<Character> queueUC6 = new LinkedList<>();
        for (int i = 0; i < inputUC6.length(); i++) {
            char c = inputUC6.charAt(i);
            stackUC6.push(c);
            queueUC6.add(c);
        }
        boolean isPalUC6 = true;
        while (!stackUC6.isEmpty()) {
            if (!stackUC6.pop().equals(queueUC6.remove())) {
                isPalUC6 = false;
                break;
            }
        }
        System.out.println("UC6 (Stack & Queue): Is '" + inputUC6 + "' a palindrome? " + isPalUC6);;
    }
}