package exercises.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice1GradeBook {

        public static void main(String[] args) {

            HashMap<Integer, String> classRoster = new HashMap<>();

            Scanner input = new Scanner(System.in);
            String newStudent;
            Integer newID;

            System.out.println("Enter students (or ENTER to finish):");

            // Get student names and IDs
            do {
                System.out.print("Student: ");
                newStudent = input.nextLine();

                if (!newStudent.equals("")) {
                    System.out.print("ID: ");
                    newID = input.nextInt();
                    classRoster.put(newID, newStudent);

//  You need this empty input line below in order to provide condition for while to end the loop.
                    input.nextLine();
                }
// The while condition below says: "While newStudent is NOT an empty string, keep doing the loop.
            } while(!newStudent.equals(""));

            // Print class roster
            System.out.println("\nClass roster:");

            for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
                System.out.println("Student: " + student.getValue() + " (ID: " + student.getKey() + ")");
            }
        }
}
