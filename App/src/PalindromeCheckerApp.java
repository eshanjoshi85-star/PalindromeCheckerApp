//Version 8.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Hardcoded Palindrome (Optimized Check)
//Use Case 3: Palindrome Check Using String Reverse
//Use Case 4: Character Array Based Palindrome Check
//Use Case 5: Stack-Based Palindrome Checker
//Use Case 6: Queue + Stack Based Palindrome Check
//Use Case 7: Deque-Based Optimized Palindrome Checker
//Use Case 8: Linked List Based Palindrome Checker
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
public class PalindromeCheckerApp {
    // Node Class for UC8
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    // Method to reverse linked list (UC8)
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("UC1: Welcome to Palindrome Checker Management System");
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

        // UC3: Reverse String Method
        String originalUC3 = "radar";
        String reversedUC3 = "";
        for (int i = originalUC3.length() - 1; i >= 0; i--) {
            reversedUC3 = reversedUC3 + originalUC3.charAt(i);
        }
        System.out.println("UC3 (Reverse): Is '" + originalUC3 + "' a palindrome? " + originalUC3.equals(reversedUC3));

        // UC4: Character Array Based Check
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

        // UC5: Stack-Based Palindrome
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

        // UC6: Stack + Queue
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
        System.out.println("UC6 (Stack & Queue): Is '" + inputUC6 + "' a palindrome? " + isPalUC6);

        // UC7: Deque-Based Optimized Check
        String inputUC7 = "level";
        Deque<Character> dequeUC7 = new LinkedList<>();
        for (int i = 0; i < inputUC7.length(); i++) {
            dequeUC7.addLast(inputUC7.charAt(i));
        }
        boolean isPalUC7 = true;
        while (dequeUC7.size() > 1) {
            char frontChar = dequeUC7.removeFirst();
            char rearChar = dequeUC7.removeLast();
            if (frontChar != rearChar) {
                isPalUC7 = false;
                break;
            }
        }
        System.out.println("UC7 (Deque Optimized): Is '" + inputUC7 + "' a palindrome? " + isPalUC7);

        // UC8: Linked List Based Palindrome Checker
        String inputUC8 = "madam";
        Node head = new Node(inputUC8.charAt(0));
        Node current = head;
        for (int i = 1; i < inputUC8.length(); i++) {
            current.next = new Node(inputUC8.charAt(i));
            current = current.next;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;
        Node tempSecond = secondHalf;
        boolean isPalUC8 = true;
        while (tempSecond != null) {
            if (firstHalf.data != tempSecond.data) {
                isPalUC8 = false;
                break;
            }
            firstHalf = firstHalf.next;
            tempSecond = tempSecond.next;
        }
        System.out.println("UC8 (Linked List): Is '" + inputUC8 + "' a palindrome? " + isPalUC8);
    }
}