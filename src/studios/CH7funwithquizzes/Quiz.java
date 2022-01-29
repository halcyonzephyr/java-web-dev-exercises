package studios.CH7funwithquizzes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Quiz {
    private ArrayList quiz = new ArrayList<>();
    private String userName;
    private Date date;

    public void addQuestion(){
        Scanner input = new Scanner(System.in);
        System.out.println("What kind of question would you like to add?");

        String questionType = input.nextLine();
        if (questionType == "True False") {
            System.out.println("Please type your question: ");
            String question = input.nextLine();
            System.out.println("Please type your answer: ");
            String answer = input.nextLine();
            TrueFalse q = new TrueFalse(question, answer);
            quiz.add(q);
        } else if (questionType == "Multiple Choice") {
            System.out.println("Please type your question including multiple choice options: ");
            String question = input.nextLine();
            System.out.println("Please type your answer as a letter: ");
            String answer = input.nextLine();
            MultipleChoice q = new MultipleChoice(question, answer);
            quiz.add(q);
        }
    }
    
    public void runQuiz(){
        for (Object q : quiz) {
            q.runQuestion();
        }
    }

}
