package exercises.chapter3;

public class ArrayPractice1 {
    public static void main(String[] args) {
//  Part 1:
        int[] myArray = {1,1,2,3,5,8};

//  Part 2a:
        System.out.println("All of the numbers in the Array: ");

    //  You can use whichever variable you want in place of "integer" below, as long as also used in print parameter below it.
        for (int integer : myArray) {
            System.out.println(integer);
        }
//  Part 2b:
        System.out.println("\nOnly the odd numbers in the Array: ");

    // %2 modulus that checks for number to be positive, but the != reverses that to check for negative (or "not positive").
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i]%2 != 0) {
                System.out.println(myArray[i]);
                }
            }
        }
    }
