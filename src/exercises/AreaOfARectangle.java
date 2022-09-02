package exercises;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        I chose to use double type to allow for decimals.
        System.out.println("Enter the length of the rectangle in inches:");
        double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle in inches:");
        double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area + " inches.");
    }
}
