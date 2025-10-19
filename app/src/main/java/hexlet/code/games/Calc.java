package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
    /**
     * Number of questions.
     */
    private static final int NUMBER_OF_QUESTIONS = 3;

    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 50;

    private Calc() {
        throw new UnsupportedOperationException();
    }

    /**
     * Play the game.
     */
    public static void play() {
        String[][] qaList = new String[NUMBER_OF_QUESTIONS][2];

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int firstNumber = Utils.generateNumber(1, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(1, MAX_NUMBER);
            char[] allowedOperator = new char[]{'+', '-', '*'};
            int index = (int) (Math.random() * allowedOperator.length);
            char operator = allowedOperator[index];
            qaList[i][0] = String.format(
                    "Question: %d %c %d",
                    firstNumber, operator, secondNumber
            );
            qaList[i][1] = answer(firstNumber, secondNumber, operator);
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "What is the result of the expression?";
    }

    private static String answer(final int firstNumber, final int secondNumber, final char operator) {
        int answer = switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalArgumentException();
        };

        return String.valueOf(answer);
    }
}
