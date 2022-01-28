package studios.CH7funwithquizzes;

import java.util.Scanner;

public class MultipleChoice extends Question{
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    public void multipleChoiceAsker() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select an answer: " + this.getQuestion());
        this.setUserAnswer(input.nextLine());
    }

    public void runQuestion() {
        multipleChoiceAsker();
        answerChecker();
    }
}


