package exercises.chapters1and2;

import java.util.Scanner;

public class NumberOfMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of miles you have driven: ");
        double miles = input.nextDouble();

        System.out.println("Enter the number of gallons of gas used: ");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;

        System.out.println("The total miles-per-gallon is: " + mpg + " mpg.");

    }
}
