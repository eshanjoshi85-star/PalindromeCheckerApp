//Version 3.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Hardcoded Palindrome (Optimized Check)
//Use Case 3: Palindrome Check Using String Reverse

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // UC1: Welcome Message
        System.out.println("Welcome to Palindrome Checker Management System");

        // UC2: Hardcoded Palindrome (Using Index Comparison)
        String original = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < original.length() / 2; i++) {
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.print("UC2 Result: ");
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }

        // UC3: Palindrome Check Using String Reverse (Concatenation)
        String original1 = "radar";
        String reversed1 = "";

        for (int i = original1.length() - 1; i >= 0; i--) {
            reversed1 = reversed1 + original1.charAt(i);
        }

        System.out.print("UC3 Result: ");
        if (original1.equals(reversed1)) {
            System.out.println("The string '" + original1 + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original1 + "' is NOT a palindrome.");
        }
    }
}