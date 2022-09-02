package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");

      /* Generally you want to declare variables as an object type with capital letter <Double> to create a wrapper class with built-in methods/tools, like isNan.
        However, the primitive type lower case <double> will work in this case. */

        /*  Bonus Part 1: Added a try/catch to utilize the program "throwing an exception" as a means to check for non-numeric or empty string input.
        So, you don't need to include additional if/else conditionals to check for each individually.*/
        try {
            Double radius = input.nextDouble();
            /* Bonus Part 2: Add while loop to re-prompt user for correct input if negative number entered. */
            while (radius < 0) {
                System.err.println("You entered a negative number! Please enter a positive number: ");
                radius = input.nextDouble();
            }

            /* Studio Part 1: get radius input and then calculate and return the area. */
//        double area = 3.14 * radius * radius;
//        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        /* Studio Part 2: Remove the processing logic above to calculate area and put into a separate Circle class.
        Then you can either directly call the method below by replacing area with Circle.getArea(radius). */
//        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

            /* OR  You can add a new variable to hold that reference call so you don't have to retype method call each time: */

            Double areaOfACircle = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + areaOfACircle);
        } catch (Exception error) {
            System.err.println("You entered a non-numeric character!");
        }

    }
}
