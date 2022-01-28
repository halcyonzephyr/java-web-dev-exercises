package studios.CH7funwithquizzes;

import java.util.Objects;

public abstract class Question {
    private String question;
    private String answer;
    private String userAnswer;
    private int uniqueID;
    private static int nextID = 1;
    private Boolean isCorrect;

    public Question() {
        uniqueID = nextID;
        nextID++;
    }

    public Question(String question, String answer) {
        this();
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public void answerChecker() {
        if (Objects.equals(getUserAnswer(), getAnswer())) {
            this.isCorrect = true;
        } else
        {this.isCorrect = false;}
    }
    public abstract void runQuestion();

}
