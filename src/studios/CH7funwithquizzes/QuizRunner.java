package studios.CH7funwithquizzes;

public class QuizRunner {
    public static void main(String[] args) {
        TrueFalse question1 = new TrueFalse("LaunchCode is the very best ever?", "True");

        MultipleChoice question2 = new MultipleChoice("What is the capital of France? A: Paris B: Nice", "A");
        question2.runQuestion();
        System.out.println(question1.getUserAnswer());
    }
}
