package javaprogramme_week8;

/**
 * Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */
public class LeftTriangle_P15 {
    public static void main(String[] args) {

       for (int i=1; i<=5; i++){
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
        }
    }
}
