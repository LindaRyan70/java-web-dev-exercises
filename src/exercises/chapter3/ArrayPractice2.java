package exercises.chapter3;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

//  Part 3: Split phrase with delimiter of empty space and store in an Array.
      String phrase = "I would not, could not, in a box. " +
              "I would not, could not with a fox. " +
              "I will not eat them in a house. " +
              "I will not eat them with a mouse.";

      String[] words = phrase.split(" ");
      System.out.println(Arrays.toString(words));

//  Part 5: Repeat but change delimiter to be by sentences/period.
      String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
