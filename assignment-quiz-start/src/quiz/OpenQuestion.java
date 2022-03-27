package quiz;

public class OpenQuestion extends Question {
    //Attributes
    private String question;
    private String answer;
    private int score;

    //Constructor
    public OpenQuestion (String question , String answer , int score) {
        super(question, answer, score);
        this.question = question;
        this.answer = answer;
        this.score = score;
    }

    public OpenQuestion (String question , String answer) {
        super(question, answer);
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return question;
    }

    @Override
    public String correctAnswer() {
        return this.answer;
    }

    @Override
    public boolean isCorrect(String answer) {
        try {
            int caseLetter = Integer.parseInt(answer);
            String answerSmall = answer;
            String thisAnswer = this.answer;
            String answerCorrectSmall = thisAnswer.toLowerCase();
            return answerSmall.equals(answerCorrectSmall);
        } finally {
            String answerSmall = answer.toLowerCase();
            String thisAnswer = this.answer;
            String answerCorrectSmall = thisAnswer.toLowerCase();
            return answerSmall.equals(answerCorrectSmall);
        }

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
