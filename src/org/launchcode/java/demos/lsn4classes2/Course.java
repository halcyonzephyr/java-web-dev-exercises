package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private final String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic) {
        this.topic = topic;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(){
        return("The course " + topic + " will be taught by " + instructor.getFirstName() + " " + instructor.getLastName() + " and will have the following enrolled students: " + enrolledStudents);
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Course name) {
        if (name == this) {
            return true;
        }
        if (name == null) {
            return false;
        }
        if (name.getClass() != getClass()){
            return false;
        }
        return name.instructor == instructor && Objects.equals(name.topic, topic);
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
