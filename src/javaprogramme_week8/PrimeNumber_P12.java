package javaprogramme_week8;

import java.util.Scanner;

/**
 *  Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class PrimeNumber_P12 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Input any number : ");
        boolean prime = S.hasNextBoolean();
        S.close();
        if (isPrime(2))
            System.out.println("This is prime number");
        else
            System.out.println("This is not prime number");
    }
    //check for number prime or not
    static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }

        return false;
    }
}
