package javaprogramme_week8;

/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class FibonacciNumber_P9 {
    public static void main (String args[])
    {
        int n = 10; //we can change number here
        System.out.println(fib(n));
    }
    static int fib(int n)
    {
        int a = 0;
        int b = 1;
        int c;
        //if syntax
        if (n == 0) {
            return a;
        }
        //for loop use
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

}

