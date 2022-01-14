package exercises.CH3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
//        It takes in student names and ID numbers (as integers) instead of names and grades.
//        The keys should be the IDs and the values should be the names.
//        Modify the roster printing code accordingly.
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name (or ENTER to finish): ");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Student ID: ");
                Integer idNumber = input.nextInt();
                students.put(idNumber, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Name: " + student.getValue() + "; ID#: " + student.getKey());

        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);

    }
}
