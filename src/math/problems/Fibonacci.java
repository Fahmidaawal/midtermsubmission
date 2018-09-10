package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
         int a = 0;
         int b = 1;
         int c = a+b;
        System.out.println(" 40 Fibonacci number ");
        for ( int x = 0; x<= 40; x++){
            System.out.println( a + " ");
            a = b;
            b = c;
            c = a+b;

        }


    }
}
