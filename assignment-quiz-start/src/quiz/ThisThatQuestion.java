package quiz;

import java.util.Locale;

public class ThisThatQuestion extends MultipleChoiceQuestion{
    //Attributes
    private String question;
    private String answer1;
    private String answer2;
    private int correctAnswer;
    int score;

    //Constructor
    ThisThatQuestion(String question, String answer1, String answer2, int correctAnswer, int score) {
        super(question, new String[] {answer1, answer2}, correctAnswer, score);
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.correctAnswer= correctAnswer;
        this.score = score;
    }

    ThisThatQuestion(String question, String answer1, String answer2, int correctAnswer) {
        super(question, new String[] {answer1, answer2}, correctAnswer);
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.correctAnswer= correctAnswer;
    }

    //Methods
    @Override
    public String toString() {
        return "" + this.answer1 + " or " + this.answer2 + ": " + this.question;
    }

    @Override
    public boolean isCorrect(String answer) {
        String answerSmall = answer.toLowerCase(Locale.ROOT);
        String answer1Small = answer1.toLowerCase(Locale.ROOT);
        String answer2Small = answer2.toLowerCase(Locale.ROOT);
        if (correctAnswer == 0 && answerSmall.equals(answer1Small)) {
            return true;
        }
        if (correctAnswer == 1 && answerSmall.equals(answer2Small)) {
            return true;
        }

        return false;
    }

    @Override
    public String correctAnswer() {
        if (correctAnswer == 0) {
            return answer1;
        }
        if (correctAnswer == 1) {
            return answer2;
        }
        return "None is correct. ;(";
    }

    @Override
    public int getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(int newScore) {
        super.setScore(newScore);
    }
}
