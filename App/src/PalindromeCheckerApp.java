//Version 13.0
//Eshan Pankaj Joshi
//Use Case 1: Welcome Message
//Use Case 2: Hardcoded Palindrome (Optimized Check)
//Use Case 3: Palindrome Check Using String Reverse
//Use Case 4: Character Array Based Palindrome Check
//Use Case 5: Stack-Based Palindrome Checker
//Use Case 6: Queue + Stack Based Palindrome Check
//Use Case 7: Deque-Based Optimized Palindrome Checker
//Use Case 8: Linked List Based Palindrome Checker
//Use Case 9: Recursive Palindrome Checker
//Use Case 10: Case-Insensitive & Space-Ignored Palindrome
//Use Case 11: Object-Oriented Palindrome Service (Encapsulation)
//Use Case 12: Strategy Pattern for Palindrome Algorithms (Advanced)
//Use Case 13: Performance Comparison (Benchmarking Algorithms)

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

// --- UC12: Strategy Pattern Definitions ---

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return input.equals(reversed.toString());
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

class PalindromeContext {
    private PalindromeStrategy strategy;
    public void setStrategy(PalindromeStrategy strategy) { this.strategy = strategy; }
    public boolean executeStrategy(String input) { return strategy.check(input); }
}

// --- UC11: Object-Oriented Palindrome Service ---

class PalindromeService {
    public boolean checkPalindrome(String input) {
        if (input == null) return false;
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : cleanInput.toCharArray()) stack.push(c);
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        return cleanInput.equals(reversed.toString());
    }
}
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

    public static Node reverseList(Node head) {
        Node prev = null, current = head, nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeIgnoreCaseSpace(String input) {
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = normalized.length() - 1;
        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }

    public static void main(String[] args) {

        // UC1: Welcome Message
        System.out.println("UC1: Welcome to Palindrome Checker Management System");
        System.out.println("---------------------------------------------------");

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
        int left = 0, right = charArray.length - 1;
        boolean isPalUC4 = true;
        while (left < right) {
            if (charArray[left] != charArray[right]) { isPalUC4 = false; break; }
            left++; right--;
        }
        System.out.println("UC4 (Char Array): Is '" + inputUC4 + "' a palindrome? " + isPalUC4);

        // UC5: Stack-Based Palindrome
        String inputUC5 = "noon";
        Stack<Character> stackUC5 = new Stack<>();
        for (int i = 0; i < inputUC5.length(); i++) stackUC5.push(inputUC5.charAt(i));
        String reversedUC5 = "";
        while (!stackUC5.isEmpty()) reversedUC5 += stackUC5.pop();
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
            if (!stackUC6.pop().equals(queueUC6.remove())) { isPalUC6 = false; break; }
        }
        System.out.println("UC6 (Stack & Queue): Is '" + inputUC6 + "' a palindrome? " + isPalUC6);

        // UC7: Deque-Based Optimized Check
        String inputUC7 = "level";
        Deque<Character> dequeUC7 = new LinkedList<>();
        for (int i = 0; i < inputUC7.length(); i++) dequeUC7.addLast(inputUC7.charAt(i));
        boolean isPalUC7 = true;
        while (dequeUC7.size() > 1) {
            if (dequeUC7.removeFirst() != dequeUC7.removeLast()) { isPalUC7 = false; break; }
        }
        System.out.println("UC7 (Deque Optimized): Is '" + inputUC7 + "' a palindrome? " + isPalUC7);

        // UC8: Linked List Based Palindrome Checker
        String inputUC8 = "madam";
        Node head = new Node(inputUC8.charAt(0));
        Node currentUC8 = head;
        for (int i = 1; i < inputUC8.length(); i++) {
            currentUC8.next = new Node(inputUC8.charAt(i));
            currentUC8 = currentUC8.next;
        }
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
        Node secondHalf = reverseList(slow), firstHalf = head;
        boolean isPalUC8 = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) { isPalUC8 = false; break; }
            firstHalf = firstHalf.next; secondHalf = secondHalf.next;
        }
        System.out.println("UC8 (Linked List): Is '" + inputUC8 + "' a palindrome? " + isPalUC8);

        // UC9: Recursive Palindrome Checker
        String inputUC9 = "refer";
        System.out.println("UC9 (Recursive): Is '" + inputUC9 + "' a palindrome? " + isPalindromeRecursive(inputUC9, 0, inputUC9.length() - 1));

        // UC10: Case-Insensitive & Space-Ignored Palindrome
        String inputUC10 = "A man a plan a canal Panama";
        System.out.println("UC10 (Ignore Case & Space): Is '" + inputUC10 + "' a palindrome? " + isPalindromeIgnoreCaseSpace(inputUC10));

        // UC11: Object-Oriented Service Implementation
        String inputUC11 = "Was it a car or a cat I saw";
        PalindromeService service = new PalindromeService();
        System.out.println("UC11 (OOPS Service): Is '" + inputUC11 + "' a palindrome? " + service.checkPalindrome(inputUC11));

        // UC12: Strategy Pattern for Palindrome Algorithms
        String inputUC12 = "racecar";
        PalindromeContext context = new PalindromeContext();
        context.setStrategy(new StackStrategy());
        System.out.println("UC12 (Stack Strategy): Is '" + inputUC12 + "' a palindrome? " + context.executeStrategy(inputUC12));
        context.setStrategy(new DequeStrategy());
        System.out.println("UC12 (Deque Strategy): Is '" + inputUC12 + "' a palindrome? " + context.executeStrategy(inputUC12));

        // UC13: Performance Comparison
        System.out.println("\nUC13: Performance Comparison (Nanoseconds)");
        String longInput = "a".repeat(1000) + "b" + "a".repeat(1000); // 2001 chars

        // Measure Recursive Approach
        long startTime = System.nanoTime();
        isPalindromeRecursive(longInput, 0, longInput.length() - 1);
        long endTime = System.nanoTime();
        System.out.println("Recursive Check Time: " + (endTime - startTime) + " ns");

        // Measure Strategy-Based Deque Approach
        context.setStrategy(new DequeStrategy());
        startTime = System.nanoTime();
        context.executeStrategy(longInput);
        endTime = System.nanoTime();
        System.out.println("Deque Strategy Time:  " + (endTime - startTime) + " ns");
    }
}