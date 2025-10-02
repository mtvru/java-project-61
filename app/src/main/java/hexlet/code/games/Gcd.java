package hexlet.code.games;

public final class Gcd implements GameInterface {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 100;

    /**
     * First number.
     */
    private int firstNumber;
    /**
     * Second number.
     */
    private int secondNumber;

    @Override
    public String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String question() {
        this.firstNumber = (int) (Math.random() * MAX_NUMBER);
        this.secondNumber = (int) (Math.random() * MAX_NUMBER);

        return  "Question: " + this.firstNumber + " " + this.secondNumber;
    }

    @Override
    public boolean checkAnswer(final String answer) {
        return this.getGcd() == Integer.parseInt(answer);
    }

    @Override
    public String correctAnswer() {
        return String.valueOf(this.getGcd());
    }

    private int getGcd() {
        while (this.secondNumber != 0) {
            int remainder = this.firstNumber % this.secondNumber;
            this.firstNumber = this.secondNumber;
            this.secondNumber = remainder;
        }

        return this.firstNumber;
    }
}
