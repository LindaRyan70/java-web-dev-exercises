//package org.launchcode.java.demos.lsn3classes1;
//
//// Start working here with your Student class.
//// To instantiate the Student class, add your code to the main in the file, SchoolPractice.
//
//public class Student {
//
//    private String name;
//    private int studentId;
//    private int numberOfCredits = 0;
//    private double gpa = 0.0;
//
//}

package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    /* Exercise: Need to create a constructor below in order to be able to instantiate an instance of the Student class elsewhere.
    Has same name as the Class. */

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }


//  Exercise: Create Getters/Setters.

    public String getName() {
        return name;
    }


//  Exercise: Making at least one setter have an access level more restrictive than public....ie private, so it can only be changed w/in the class.
    private void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }



//
//    public void getSetName() {
//        return setName;
//    }
//
//    public void setSetName(void setName) {
//        this.setName = setName;
//    }
//
//    private void setName



//    Lecture example below of time you might not use void b/c you actually want to return a value in your setter. But, generally setters do NOT return a value.
//
//    public int setHardNumberOfCredits() {
//        this.numberOfCredits = numberOfCredits + 1;
//        return numberOfCredits;
//    }
//
//
//    Lecture example of using validation in a setter:
//
//    public void setHardNumberOfCreditsValidated(int numberOfCredits) {
//        if(numberOfCredits + this.numberOfCredits < 20) {
//            this.numberOfCredits = numberOfCredits;
//        }
//    }


}