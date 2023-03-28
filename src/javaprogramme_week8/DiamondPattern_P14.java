package javaprogramme_week8;

/**
 *  Write a program in Java to display the pattern like a diamond.
 *  While loop
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 */
public class DiamondPattern_P14 {
    public static void main(String[] args) {
        int i,j,k;
        for(i=1; i<=5; i++){   //raws
            for(j=5; j>i; j--){  //space(column)
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(i=4; i>=1; i--){   //raws
            for(j=5; j>i; j--){  //space(column)
                System.out.print(" ");
            }
            for(k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
