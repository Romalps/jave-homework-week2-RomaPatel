package week2javahomework;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
 */
public class Program6AreaOfCircle {

    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        double radius = scanner.nextDouble();

        areaOfCircle(radius);
        // closing the scanner object
        scanner.close();
    }

    //calculating the area of circle
    public static void areaOfCircle(double radius) {

        double pi = Math.PI;
        double area = (pi * radius * radius);
        System.out.println("The area of Circle is : " + area);
    }

}
