package javaprogramme_week8;
/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 *  Use n = n / 10 to discard the least-significant digit.
 *  The method needs to be static
 *  Create a class with the name DigitSumChallenge.
 */

import java.util.Scanner;

public class DigitSumChallenge_P4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter sum number = ");
        boolean number = S.hasNext();
        System.out.println("Sum of 125 is = " + sumDigits(125));// Should return 8 => 1 + 2 + 5 = 8
        System.out.println("sum of 854 is = " + sumDigits(854));// Should return 17 => 8 + 5 + 4 = 17
        System.out.println("sum of 18 is = "+ sumDigits(18));// Should return 9 => 1 + 8 = 9
        System.out.println("sum of -3 is = "+ sumDigits(-3));// Should return -1
        S.close();
    }
    public static int sumDigits(int number) {
        // int validateSum = S.sumDigits();
        if (number < 10) {
            System.out.println("valid number");
            return -1;
        } else {
            System.out.println("Invalid number");
        }

        int sumDigits = 0;
        String numberToString = Integer.toString(number);// Convert number to string
        for (char c : numberToString.toCharArray()) {// Map through all char of the string
            sumDigits += Integer.parseInt(String.valueOf(c));// Convert the char to number again
        }
        return sumDigits;

    }
}