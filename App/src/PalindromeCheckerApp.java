//Version 4.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Hardcoded Palindrome (Optimized Check)
//Use Case 3: Palindrome Check Using String Reverse
//Use Case 4: Character Array Based Palindrome Check

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
        System.out.println("UC2 Result: The string '" + original + "' is a palindrome? " + isPalindrome);
        // UC3: Palindrome Check Using String Reverse (Concatenation)
        String original1 = "radar";
        String reversed1 = "";
        for (int i = original1.length() - 1; i >= 0; i--) {
            reversed1 = reversed1 + original1.charAt(i);
        }
        System.out.println("UC3 Result: The string '" + original1 + "' is a palindrome? " + original1.equals(reversed1));
        // UC4: Character Array Based Palindrome Check
        String input = "deified";
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        isPalindrome = true;
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("UC4 Result: The string '" + input + "' is a palindrome? " + isPalindrome);
    }
}