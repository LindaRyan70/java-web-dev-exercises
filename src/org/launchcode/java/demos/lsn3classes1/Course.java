package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

//  Fields:

    private String topic;
    private ArrayList<Student> enrolledStudents;


//  Constructor:

    public Course(String topic, ArrayList<Student> enrolledStudents){
        this.topic = topic;
        this.enrolledStudents = enrolledStudents;
    }


//  Getters/Setters:

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

}
