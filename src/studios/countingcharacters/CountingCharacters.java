package studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String args []) {

        Scanner input = new Scanner(System.in);

/*  The code below (String inputText) and (char[] charactersInString) were replaced with the Bonus Mission code below.  */
//        String inputText = "If the product of two terms " +
//                "is zero then common sense says at least one " +
//                "of the two terms has to be zero to start with. " +
//                "So if you move all the terms over to one side, " +
//                "you can put the quadratics into a form that can " +
//                "be factored allowing that side of the equation to equal zero. " +
//                "Once you've done that, it's pretty straightforward from there.";
//
//        char[] charactersInString = inputText.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();

    /* Bonus Mission Part 1: Prompt user input of a string to count characters for. */
        System.out.println("Please input a string to count characters: ");
        String userInput = input.nextLine();

    /*  Bonus Mission Part 2 and 3: Line below was modified to make character counts (userInput) case-insensitive (.toLowerCase())
    and exclude non-alpha characters (.replaceAll("[^A-Za-z]", "") and then create an array of characters (.toCharArray()).
    Technically, for this you could just use "[^a-z]" because already changing toLowerCase(). */
        char[] charactersInString = userInput.toLowerCase().replaceAll("[^A-Za-z]", "").toCharArray();

    /*  Create HashMap with line below. */
        HashMap<Character, Integer> countCharacters = new HashMap<>();

    /*  for and nested if/else loops below serve to iterate through the HashMap to check
    if character already found and set key/value pairs and track counts accordingly.   */
        for(char character: charactersInString) {

            if (countCharacters.containsKey(character)) {
                countCharacters.put(character,countCharacters.get(character)+1);
            } else {
                countCharacters.put(character, 1);
            }
        }

//  The variable in for loop below (character) can be whatever you want as long as used throughout scope of the loop.
        for (Map.Entry<Character, Integer> character: countCharacters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
