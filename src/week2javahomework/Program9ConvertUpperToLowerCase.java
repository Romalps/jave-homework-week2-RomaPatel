package week2javahomework;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */

public class Program9ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for  reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Uppercase string : ");
        String uppercase = scanner.nextLine();

        Program9ConvertUpperToLowerCase t = new Program9ConvertUpperToLowerCase();
        t.convertUppercaseToLowercase(uppercase);
        //closing the scanner object
        scanner.close();

    }

    //conversion of Uppercase to Lowercase method
    public void convertUppercaseToLowercase(String text) {

        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
