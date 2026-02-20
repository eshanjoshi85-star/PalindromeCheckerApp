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
