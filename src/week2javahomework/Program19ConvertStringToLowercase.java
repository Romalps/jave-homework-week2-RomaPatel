package week2javahomework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19ConvertStringToLowercase {

    public static void main(String[] args) {

        //scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the uppercase sentence : ");
        String uppercase = scanner.nextLine();
        Program19ConvertStringToLowercase t = new Program19ConvertStringToLowercase();
        t.convertStringToLowercase(uppercase);
        //closing the scanner object
        scanner.close();
    }

    //convert string to lower case
    public void convertStringToLowercase(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());

    }
}
