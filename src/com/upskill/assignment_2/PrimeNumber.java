package com.upskill.assignment_2;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("The Prime numbers are:");
		int i;
     for(i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
	}


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }



	}


