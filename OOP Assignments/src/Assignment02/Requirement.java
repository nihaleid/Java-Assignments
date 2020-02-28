package Assignment02;

import java.util.Scanner;

/**
 *
 * @author nihal
 */
public class Requirement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Fibonacci fib = new Fibonacci();
        for (int i = 1; i <= n; ++i) {
            System.out.print(fib.fibonacci(i)+" ");
        }
    }

}
