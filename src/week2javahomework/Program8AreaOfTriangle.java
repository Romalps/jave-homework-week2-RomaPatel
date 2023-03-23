package week2javahomework;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Program8AreaOfTriangle {
    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt();

        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaOfTriangle(length,height);
        //closing the scanner object
        scanner.close();
    }
    // calculating the area of triangle with no return type with parameter method
    public static void areaOfTriangle(int length, int height){
        int area =(length * height)/ 2;
        System.out.println("The area of a triangle is :"+ area);

    }

}
