package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
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
        String[][] qaList = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.generateNumber(1, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(1, MAX_NUMBER);
            char[] allowedOperator = new char[]{'+', '-', '*'};
            int index = Utils.generateNumber(0, allowedOperator.length - 1);
            char operator = allowedOperator[index];
            String question = String.format(
                    "%d %c %d",
                    firstNumber, operator, secondNumber
            );
            qaList[i][0] = question;
            qaList[i][1] = answer(firstNumber, secondNumber, operator);
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "What is the result of the expression?";
    }

    private static String answer(
        final int firstNumber,
        final int secondNumber,
        final char operator
    ) {
        int answer = switch (operator) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new RuntimeException("Unknown input: " + operator);
        };

        return String.valueOf(answer);
    }
}
