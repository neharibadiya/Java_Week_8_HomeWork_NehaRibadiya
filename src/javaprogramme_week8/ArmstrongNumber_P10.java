package javaprogramme_week8;

import java.util.Scanner;

/**
 * . Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class ArmstrongNumber_P10 {
    public static void main(String[] args) {
        Scanner number =new Scanner(System.in);
        System.out.println("Enter any number : ");

        int n =153;
        int temp = n;
        int p = 0;

       // function to calculate the sum of individual digits
        while(n > 0){
            int rem = n % 10;
            p = (p) + (rem * rem * rem);
            n = n / 10;
        }
        boolean Armstrongnumber = number.hasNextBoolean();
        //condition to check whether the value of P equals to user input or not.
        if (temp == p){
            System.out.println("yes it is Armstrong number.");
        }else {
            System.out.println("No it is not Armstrong number.");
        }
        number.close();

    }
}
