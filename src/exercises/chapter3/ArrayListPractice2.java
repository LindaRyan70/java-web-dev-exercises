package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice2 {
    public static void main(String[] args) {

//  Part 3: Allow for user input to select the fixed word length using Scanner below.
        Scanner input = new Scanner(System.in);

// Bonus:  Skipped Part 2 about creating a list of various length words and just went straight to using the Bonus phrase from ArrayPractice2.
        String phrase = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";

/* Bonus: In order to check the string for words of a fixed number length, you need to remove punctuation.
You could either use a regex to replace all punctuation "\\p{Punct}" like below, or a particular
symbol like a period "\\." or a comma "\\,". */

        String newPhrase = phrase.replaceAll("\\p{Punct}", "" );
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(newPhrase.split(" ")));

//  Part 3: Code below will prompt user to input the fixed word length.
        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

//  Part 2 continued: Print the words by calling the printFixedLetterWords() method here in the Main() method.
        printFixedLetterWords(wordList, numChars);
    }

//  Part 2: Combined this with the Bonus to create static method to print out words of a fixed length (based on user input).
//  Must have the new method created OUTSIDE of the Main method!!
    public static void printFixedLetterWords(ArrayList<String> arr, int happy) {
        for (String word: arr) {
            if (word.length() == happy) {
                System.out.println(word);
            }
        }
    }
}
