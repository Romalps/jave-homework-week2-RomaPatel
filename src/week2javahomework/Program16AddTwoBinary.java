package week2javahomework;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
*/
public class Program16AddTwoBinary {

    public static void main(String[] args) {
        System.out.println("Welcome to Java program to add two binary numbers ");
    // scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter hte first binary number : " );
        String  first = scanner.nextLine();
        System.out.print("Please enter the second binary number : ");
        String second = scanner.nextLine();
        String  addition = addTwoBinaryNumbers(first,second);
        System.out.println("The addition of two binary number is : "+ addition);
        //closing the scanner object
        scanner.close();
    }

    //adding the two Binary Numbers
    public static String addTwoBinaryNumbers(String first, String second){

        int b1 = Integer.parseInt(first,2);
        int b2 = Integer.parseInt(second,2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}
