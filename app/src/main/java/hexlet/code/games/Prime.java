package hexlet.code.games;

public class Prime implements GameInterface {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 90;
    /**
     * Even number.
     */
    private static final int EVEN_NUMBER = 2;
    /**
     * Odd number.
     */
    private static final int ODD_NUMBER = 3;

    /**
     * Prime number.
     */
    private int number;

    @Override
    public final String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public final String question() {
        this.number = (int) (Math.random() * MAX_NUMBER);

        return  "Question: " + this.number;
    }

    @Override
    public final boolean checkAnswer(final String answer) {
        return this.isPrime() == answer.equals("yes");
    }

    @Override
    public final String correctAnswer() {
        return this.isPrime() ? "yes" : "no";
    }

    private boolean isPrime() {
        if (this.number < EVEN_NUMBER) {
            return false;
        } else if (this.number == EVEN_NUMBER) {
            return true;
        } else if (this.number % EVEN_NUMBER == 0) {
            return false;
        }

        int sqrtN = (int) Math.sqrt(this.number);

        for (int i = ODD_NUMBER; i <= sqrtN; i += 2) {
            if (this.number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
