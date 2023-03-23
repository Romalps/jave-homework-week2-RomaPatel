package week2javahomework;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17DecimalToBinary {

    public static void main(String[] args) {

        //scanner declaration for reading the input from console
        System.out.println("Welcome to java program to convert decimal to binary numbers ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter decimal number : ");
        int number = scanner.nextInt();
        converDecimalToBinary(number);
        //closing the scanner object
        scanner.close();
    }

    // Converting the decimal to binary
    public static void converDecimalToBinary(int number) {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}
