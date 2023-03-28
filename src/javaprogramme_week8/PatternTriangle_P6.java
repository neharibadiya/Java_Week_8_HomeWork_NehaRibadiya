package javaprogramme_week8;
/**
 *  Write a program in Java to display the pattern like a triangle with a number.
 *  For eg.
 *  Input number of rows: 10
 *  Expected Output:
 *  1
 *  12
 *  123
 *  1234
 *  12345
 *  123456
 *  1234567
 *  12345678
 *  123456789
 *  12345678910
 */

import java.util.Scanner;

public class PatternTriangle_P6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int n = input.nextInt();
        int i,j,num;
        //i for rows and j for column
        //row denotes the number of rows you want to print
        for (i = 1; i <= n; i++) {  //outer loop for rows
            for (j = 1; j <= i; j++) {  //inner loop for columns
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
