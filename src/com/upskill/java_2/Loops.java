package com.upskill.java_2;

public class Loops {
	/*
	 * Types of loops 1. For Loop 2. While loop (Known as Conditional Loop. 3.
	 * Do While loop 4. Infinity loop
	 * 
	 */
	public static void main(String[] args) {
		practiceForLoop();
		// practiceWhileLoop();
		// practiceDoWhileLoop();
		// practiceInfiniteLoop();
		practiceNestedForLoop();
	}

	public static void practiceForLoop() { // For Loop- Does repeatedly upto
											// upper limit
		// int i;
		for (int i = 1; i <= 50; i++) { // Setting up lower limit, Upper limit,
										// Increment or Decrement
			System.out.print(" " + i); // Statement

		}
	}

	public static void practiceForLoop1() { // For Loop- Does repeatedly upto					its kind of a conditional loop
											// upper limit
		int i;
		for (i = 10; i >= 1; i--) { // Setting up lower limit, Upper limit,
									// Increment or Decrement
			System.out.println("For loops number = " + i);
		}
	}

	public static void practiceWhileLoop() { // While loop- Repeats upto
												// Condition Matches
		int i = 1;
		while (i <= 10) { // Setting Condition
			System.out.println("While loop number- " + i); // Statement
			i++; // Increment or Decrement
		}
		;

	}

	public static void practiceDoWhileLoop() { // Do While Loop- Does action
												// that match condition
		int i = 1;
		do {
			System.out.println("Do While Loop - " + i);
			i++;
		} while (i <= 10); // Checking Condition
	}

	public static void practiceInfiniteLoop() { // Infinite Loop- Never ending
												// loop
		int i;
		for (i = 1;; i++) {
			System.out.println("Infinit loops number = " + i);
		}
	}

	public static void practiceNestedForLoop() {
		int i;
		int j;
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				int multiplicationTable = i * j;
				System.out.print(multiplicationTable + " ");
			}
			System.out.println(" ");
		}
	}
}
