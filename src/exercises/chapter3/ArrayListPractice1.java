package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

//  Arrays.asList(item 1, item 2, etc.) is used below to initialize the ArrayList.
        ArrayList<Integer> someIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(sumEven(someIntegers));
    }

//    Part 1: Write a static method to find sum of all even numbers in an ArrayList.
        public static Integer sumEven (ArrayList < Integer > myArray) {
            int total = 0;
            for (Integer integer : myArray) {
                if (integer % 2 == 0) {
                    total += integer;
                }
            }
            return total;
        }
    }


