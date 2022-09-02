package exercises;

// Exercise #4 Part 1: Create a String of textbook-provided sentence and use Scanner to get user input for a term to search for in that string..

import java.sql.SQLOutput;
import java.util.Scanner;

public class AliceTermSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String rawString = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: " +
            "once or twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, " +
            "'and what is the use of a book,' " +
            "thought Alice 'without pictures or conversation?'";

        String firstSentence = rawString.toLowerCase();
        System.out.println("Enter a term to search for: ");
        String searchTerm = input.nextLine().toLowerCase();

        // Exercise #4 Part 2: check if the original sentence contains the search term and return a boolean true/false.
        Boolean result = firstSentence.contains(searchTerm);
        System.out.println("The first sentence of 'Alice's Adventures in Wonderland' contains your search term: " + result);

        // Exercise #5 Part 1: return the index and length of the search term entered by the user.
        Integer index = firstSentence.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at index: " + index + ". Your term is: " + length + " characters long.");

        // Exercise #5 Part 2: remove the search term from the original sentence (and replace it with an empty string.)
        String modifiedSentence = firstSentence.replace(searchTerm, "");
        System.out.println(modifiedSentence);

    }
}
