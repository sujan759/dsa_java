package javabasic.loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close(); // Close the scanner to avoid memory leaks

        // Edge cases: Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        
        // Check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {  // If n is divisible by any number, it's not prime
                isPrime = false;
                break;
            }
        }

        // Print result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
