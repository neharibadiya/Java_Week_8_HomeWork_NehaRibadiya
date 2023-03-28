package javaprogramme_week8;

/**
 * . Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */

public class Triangle_P8 {
    public static void main(String[] args) {
        int k = 5;  //row of last line
        RightTriangle(k);
    }
    public static void RightTriangle(int n){
        int a,b;
        for (a = 0; a < n; a++) {  //outer loop to handle number of rows
            for (b = 0; b <= a; b++) {  //inner loop to handle number of columns
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
