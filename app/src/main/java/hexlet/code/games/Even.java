package hexlet.code.games;

public final class Even implements GameInterface {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 30;

    /**
     * Question number.
     */
    private int number;

    @Override
    public String description() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String question() {
        this.number = (int) (Math.random() * MAX_NUMBER);

        return  "Question: " + number;
    }

    @Override
    public boolean checkAnswer(final String answer) {
        return (this.number % 2 == 0) == (answer.equals("yes"));
    }

    @Override
    public String correctAnswer() {
        return (this.number % 2 == 0) ? "yes" : "no";
    }
}
