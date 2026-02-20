//Version 1.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Harcoded Palindrome
public class PalindromeCheckerApp{
    public static void main(String[] args){
        //Use Case 1: Welcome Message
        System.out.println("Welcome to Palindrome Checker Management System");
        //Use Case 2: Hardcoded Check
        String original = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < original.length() / 2; i++) {
            if (original.charAt(i) != original.charAt(original.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is not a palindrome.");
        }
    }
}