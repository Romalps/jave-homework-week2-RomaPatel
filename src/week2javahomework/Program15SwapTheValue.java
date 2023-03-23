package week2javahomework;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class Program15SwapTheValue {
    public static void main(String[] args) {
        // scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first variable value : ");
        int first = scanner.nextInt();

        System.out.print("Enter the second variable value : ");
        int second = scanner.nextInt();

        Program15SwapTheValue t = new Program15SwapTheValue();
        t.swapTheValue(first, second);

        //closing the scanner object
        scanner.close();
    }

    // swapping the value of variables
    public void swapTheValue(int a, int b) {
        int c;
        System.out.println(("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b));
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The value of first variable is : " + a + " and second variable is : " + b);

    }

}
