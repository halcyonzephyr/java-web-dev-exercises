package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student name;
        name = new Student();
        name.setName("Gus");
        name.setStudentId(1);
        name.setNumberOfCredits(1);
        name.setGpa(4.0);

        System.out.println("Name: " + name.getName());
        System.out.println("Student ID: " + name.getStudentId());
        System.out.println("Number of credits: " + name.getNumberOfCredits());
        System.out.println("GPA: " + name.getGpa());


    }
}
