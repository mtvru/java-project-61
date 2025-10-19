package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
    /**
     * Number of questions.
     */
    private static final int NUMBER_OF_QUESTIONS = 3;

    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 100;

    private Gcd() {
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
            qaList[i][0] = "Question: " + firstNumber + " " + secondNumber;
            qaList[i][1] = answer(firstNumber, secondNumber);
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String answer(final int firstNumber, final int secondNumber) {
        return String.valueOf(getGcd(firstNumber, secondNumber));
    }

    private static int getGcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;
            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return firstNumber;
    }
}
