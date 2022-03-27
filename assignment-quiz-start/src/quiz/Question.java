package quiz;

public abstract class Question {

    //Attributes
    private String textQuestion;
    private int score;
    private String answer;

    /**
     * Constructor for Question class with given score
     * @param textQuestion
     * @param answer
     * @param score
     */
    public Question(String textQuestion, String answer, int score) {
        this.textQuestion = textQuestion;
        this.score = score;
        this.answer = answer;
    }

    /**
     * Constructor for Question without given score
     * @param question
     * @param answer
     */
    public Question(String question, String answer) {
        this.textQuestion = question;
        this.answer = answer;
        this.score = 3;
    }

    /**
     * @param answer
     * Checks if given answer is true or false.
     * @return true when given answer equals to correct answer, false otherwise.
     */
    public abstract boolean isCorrect(String answer);

    /**
     * Returns correct answer following given standards in the PDF for specific question categories
     * @return String correct answer
     */
    public abstract String correctAnswer();

    /**
     * Gives string representation of question
     * @return question (String)
     */
    public abstract String toString();

    public int getScore() {
        if (score > 5 || score < 1)
            score = 3;
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}
