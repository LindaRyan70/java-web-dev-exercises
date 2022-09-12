package org.launchcode.java.demos.lsn4classes2;

import org.launchcode.java.demos.lsn4classes2.Student;
import org.launchcode.java.demos.lsn4classes2.Teacher;

public class SchoolPractice {

    public static void main(String[] args) {

        // Instantiate your Student class for part 2 here!
        org.launchcode.java.demos.lsn4classes2.Student firstStudent = new Student("Linda Ryan", 123456, 1, 4.0);
        org.launchcode.java.demos.lsn4classes2.Student secondStudent = new Student("Patrick Ryan", 234567, 60, 3.5);

//  Without creating your own toString() method override, this will merely print out the reference location of the firstStudent object.
//  WITH a custom toString() method - found on the Course class - the internal object data values will print.
        System.out.println(firstStudent);
        System.out.println(secondStudent);

//  Version 1 of getGradeLevel() Version 1: Printing the getGradeLevel() method data from Course class without a method parameter, using this.numberOfCredits.
//        System.out.println(firstStudent.getGradeLevel());

//  Version 2 of getGradeLevel(int credits) Version 2: Printing the getGradeLevel() method data from Course class WITH a method parameter (int credits) to allow for adding credits.
//        System.out.println(firstStudent.getGradeLevel(29));

//  Version 3/Textbook Solution of getGradeLevel(int credits) Version 2: Printing the getGradeLevel() method data from Course class WITH a method parameter (int credits) to input credits w/o adding to current this.numberOfCredits.
//        System.out.println(firstStudent.getGradeLevel(29));


//  Printing out the results.
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getStudentId());
        System.out.println(firstStudent.getNumberOfCredits());
        System.out.println(firstStudent.getGpa());


//  Practicing with equals() methods.
        System.out.println(firstStudent.equals(secondStudent));


//  I was practicing instantiating a new Teacher object, passing arguments, and printing it.
        org.launchcode.java.demos.lsn4classes2.Teacher firstTeacher = new Teacher("Sue", "Smith", "Geometry", 15);
        System.out.println(firstTeacher.getFirstName() + " " + firstTeacher.getLastName() + " " + firstTeacher.getSubject() + " " + firstTeacher.getYearsTeaching());

//  Tried to instantiate a new Course class, but having trouble with how to add values for the last parameters for (ArrayList<Student> enrolledStudents).
//        Course firstCourse = new Course("Mathematics", ????????????????????????????????);
//        System.out.println(firstCourse.getTopic() + " " + " " + firstCourse.getEnrolledStudents());
    }
}
