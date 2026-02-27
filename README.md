# PalindromeCheckerApp
The objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

UC1: Application Entry & Welcome Message
-
**Goal:** 

Display a welcome message and app details at startup.
**Actor:** 

User

**Flow:**

1.Program starts.

2.JVM invokes the main() method.

3.Application name is displayed.

4.Application version is displayed.

5.Program continues to next use case or exits.

**Key Concepts used in UC1:**

Class – Acts as a container for the Palindrome Checker application logic.

Main Method – Entry point of the Java application with the signature

public static void main(String[] args).

Static Keyword – Allows the JVM to invoke the main() method without creating an object.

Console Output – System.out.println() is used to display messages on the console.

Application Flow Control – Defines the startup behavior before palindrome processing begins.

UC2: Print a Hardcoded Palindrome Result
-
**Goal:**

Display whether a hardcoded string is a palindrome.
**Actor:**

User

**Flow:**

1.Program starts

2.Hardcoded string is checked

3.Result is printed

4.Program exits


**Key Concepts used in UC2:**

Class – In Java, even the simplest program must be written inside a class, as a class acts as a container to hold program logic.

Main Method – Entry point of the Java application with the signature
public static void main(String[] args).

Static Keyword – Allows the JVM to invoke the main() method without creating an object of the class.

String – A built-in Java class used to store and manipulate textual data. Here, it stores the word to be checked for a palindrome.

String Literal – Text enclosed within double quotes ("madam"), stored in the String constant pool.

Conditional Statement (if-else) – Used to evaluate whether the given string satisfies the palindrome condition.

Console Output – System.out.println() is used to display the result on the console.

UC3: Palindrome Check Using String Reverse
-

**Goal:** 

Check whether a string is a palindrome by reversing it.

**Flow:**

1.Reverse string using loop

2.Compare original and reversed

3.Display result

4.Key Concepts used in UC3:

5.Loop (for loop) – Used to iterate through the characters of the string in reverse order.

6.String Immutability – In Java, String objects are immutable; every modification creates a new String object.

7.String Concatenation (+) – Used to build the reversed string character by character (introduced here to later discuss drawbacks).

8.equals() Method – Used to compare the actual content of two String objects instead of memory references.

**Data Structure:** 

String  

UC4: Character Array Based Palindrome Check
-
**Goal:** 

Convert string to character array and compare characters.

**Flow:**

1.Convert string to char[]

2.Use two-pointer approach

3.Compare start & end characters

**Key Concepts used in UC4:**

Character Array (char[]) – A primitive array used to store individual characters of a string for index-based access.

Array Indexing – Accessing elements using index positions starting from 0.

Two-Pointer Technique – One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons.

Time Complexity Awareness – Demonstrates efficient comparison without creating extra objects.

**Data Structure:** 

char[]

UC5: Stack-Based Palindrome Checker
-

**Goal:**

Use stack to reverse characters and validate palindrome.

**Flow:**

1.Push characters into stack

2.Pop and compare

3.Print result

**Key Concepts used in UC5:**

Stack – A linear data structure that follows the Last In First Out (LIFO) principle.

Push Operation – Used to insert characters into the stack.

Pop Operation – Used to remove characters from the stack in reverse order.

Reversal Logic – Stack naturally reverses the order of elements, making it suitable for palindrome validation.

**Data Structure:** 

Stack

UC6: Queue + Stack Based Palindrome Check
-
**Goal:** 

Demonstrate FIFO vs LIFO using Queue and Stack.

**Flow:**

1.Enqueue characters

2.Push characters to stack

3.Compare dequeue vs pop

**Key Concepts used in UC6:**

Queue – A linear data structure that follows the First In First Out (FIFO) principle.

Enqueue & Dequeue Operations – Used to insert and remove elements from the queue.

Stack vs Queue – Demonstrates the behavioral difference between LIFO and FIFO structures.

Logical Comparison – Matching dequeue (queue) output with pop (stack) output to validate palindrome logic.

**Data Structures:** 

Queue, Stack

**UC7: Deque-Based Optimized Palindrome Checker**
-
**Goal:** 

Use Deque to compare front and rear elements.

**Flow:**

1.Insert characters into deque

2.Remove first & last

3.Compare until empty

**Key Concepts used in UC7:**

Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.

Front and Rear Access – Enables direct comparison of first and last characters.

Optimized Data Handling – Eliminates the need for separate reversal data structures.

**Data Structure:** 

Deque


**UC8: Linked List Based Palindrome Checker**
-
**Goal:** 

Check palindrome using singly linked list.

**Flow:**

1.Convert string to linked list

2.Reverse second half

3.Compare halves

**Key Concepts used in UC8:**

Singly Linked List – A dynamic data structure where elements are connected using node references.

Node Traversal – Sequential access to elements using next references.

Fast and Slow Pointer Technique – Used to find the middle of the linked list efficiently.

In-Place Reversal – Reverses the second half of the list without extra memory.

**Data Structure:** 

Singly Linked List

**UC9: Recursive Palindrome Checker**
-
**Goal:** 

Check palindrome using recursion.

Flow:

1.Recursive call compares start & end

2.Base condition exits recursion

**Key Concepts used in UC9:**

Recursion – A technique where a method calls itself to solve smaller subproblems.

Base Condition – Prevents infinite recursion and terminates the recursive calls.

Call Stack – Memory structure used to manage method calls during recursion.

**Data Structure:** 

Call Stack

**UC10: Case-Insensitive & Space-Ignored Palindrome**
-

**Goal:**

Ignore spaces and case while checking a palindrome.

**Flow:**

1.Normalize string

2.Apply previous logic

**Key Concepts used in UC10:**

String preprocessing

Regular expressions

**Data Structure:**

String / Array

**UC11: Object-Oriented Palindrome Service**
-
**Goal:** 

Encapsulate palindrome logic in a class.

**Flow:**

1.Create PalindromeChecker class

2.Expose checkPalindrome() method

**Key Concepts used in UC11 (OOPS):**

Encapsulation

Single Responsibility Principle

**Data Structure:** 

Internal (Stack / Array)

**UC12: Strategy Pattern for Palindrome Algorithms (Advanced)**
-

**Goal:** 

Choose a palindrome algorithm dynamically.

**Flow:**

1.Define PalindromeStrategy interface

2.Implement StackStrategy, DequeStrategy

3.Inject strategy at runtime

**Key Concepts used in UC12:**

Interface

Polymorphism

Strategy Pattern

**Data Structure:** 

Varies per strategy
