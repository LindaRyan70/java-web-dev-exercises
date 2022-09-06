package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {

    public static void main(String[] args) {

        // Instantiate your Student class for part 2 here!
        Student firstStudent = new Student("Linda Ryan", 123456, 1, 4.0);


//  Printing out the results.
        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getStudentId());
        System.out.println(firstStudent.getNumberOfCredits());
        System.out.println(firstStudent.getGpa());


//  I was practicing instantiating a new Teacher object, passing arguments, and printing it.
        Teacher firstTeacher = new Teacher("Sue", "Smith", "Geometry", 15);
        System.out.println(firstTeacher.getFirstName() + " " + firstTeacher.getLastName() + " " + firstTeacher.getSubject() + " " + firstTeacher.getYearsTeaching());

//  Tried to instantiate a new Course class, but having trouble with how to add values for the last parameters for (ArrayList<Student> enrolledStudents).
//        Course firstCourse = new Course("Mathematics", ????????????????????????????????);
//        System.out.println(firstCourse.getTopic() + " " + " " + firstCourse.getEnrolledStudents());
    }
}
