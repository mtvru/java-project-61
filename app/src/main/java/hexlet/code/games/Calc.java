package hexlet.code.games;

public final class Calc implements GameInterface {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 50;

    /**
     * First number.
     */
    private int firstNumber;
    /**
     * Second number.
     */
    private int secondNumber;
    /**
     * Operator.
     */
    private char operator;

    @Override
    public String description() {
        return "What is the result of the expression?";
    }

    @Override
    public String question() {
        this.firstNumber = (int) (Math.random() * MAX_NUMBER);
        this.secondNumber = (int) (Math.random() * MAX_NUMBER);
        char[] allowedOperator = new char[]{'+', '-', '*'};
        int index = (int) (Math.random() * allowedOperator.length);
        this.operator = allowedOperator[index];

        return String.format(
                "Question: %d %c %d",
                this.firstNumber, this.operator, this.secondNumber
        );
    }

    @Override
    public boolean checkAnswer(final String answer) {
        int correctResult = this.correctResult();

        try {
            return Integer.parseInt(answer) == correctResult;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public String correctAnswer() {
        return String.valueOf(this.correctResult());
    }

    private int correctResult() {
        return switch (this.operator) {
            case '+' -> this.firstNumber + this.secondNumber;
            case '-' -> this.firstNumber - this.secondNumber;
            case '*' -> this.firstNumber * this.secondNumber;
            default -> throw new IllegalArgumentException();
        };
    }
}
