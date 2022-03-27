package quiz;

public class MultipleChoiceQuestion extends Question{
    //Attributes
    private String question;
    private String[] answers;
    private int correctAnswer;
    private int score;

    //Constructor
    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer, int score) {
        super(question, answers[correctAnswer], score);
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
        this.score = score;
    }

    public MultipleChoiceQuestion(String question, String[] answers, int correctAnswer) {
        super(question, answers[correctAnswer]);
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    //Methods
    @Override
    public boolean isCorrect(String answer) {
        String alphabet = "abcdefghijklmnoprstuwz";
        char answerLetter = alphabet.charAt(correctAnswer);
        String answerSmall = answer.toLowerCase();
        String answerLetterString = Character.toString(answerLetter);
        if (answerSmall.equals(answerLetterString)) {
            return true;
        }
        return false;
    }

    @Override
    public String correctAnswer() {
        String alphabet = "abcdefghijklmnoprstuwz";
        char answerLetter = alphabet.charAt(correctAnswer);
        String answerLetterString = Character.toString(answerLetter);

        return answerLetterString;
    }

    @Override
    public int getScore() {
        return super.getScore();
    }

    @Override
    public void setScore(int newScore) {
        super.setScore(newScore);
    }

    @Override
    public String toString() {
        char abcdList[] = new char[10];
        String alphabet = "abcdefghijklmnoprstuwz";
        String possibleAnswersString = "";

        //Creating abcd... array
        for(int i = 0; i < this.answers.length; i++) {
            abcdList[i] = alphabet.charAt(i);
        }

        possibleAnswersString = question;

        //Assigning
        for(int i = 0; i < this.answers.length; i++) {
            possibleAnswersString += "\n" + abcdList[i] + ") " + answers[i];
        }

        possibleAnswersString += "\n";
        return possibleAnswersString;
    }
}
