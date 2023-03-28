package javaprogramme_week8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 *  alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 *  Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 *  Input an alphabet: p
 *  Expected Output:
 *  Input letter is Consonant
 */
public class LetterIsConsonant_P3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please provide single character from the alphabet : ");
        String letter = scan.next();

        if(letter.length() == 1 && Character.isAlphabetic(letter.charAt(0))){
            char ch = Character.toLowerCase(letter.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                System.out.println("Vowel");
            }else{
                System.out.println("Consonant");
            }
        }else{
            System.out.println("Error");
        }
    }
}
