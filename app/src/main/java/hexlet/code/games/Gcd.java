package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
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
        String[][] qaList = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int firstNumber = Utils.generateNumber(1, MAX_NUMBER);
            int secondNumber = Utils.generateNumber(1, MAX_NUMBER);
            String question = firstNumber + " " + secondNumber;
            String answer = String.valueOf(getGcd(firstNumber, secondNumber));
            qaList[i][0] = question;
            qaList[i][1] = answer;
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static int getGcd(final int firstNumber, final int secondNumber) {
        int firstNumb = firstNumber;
        int secondNumb = secondNumber;

        while (secondNumb != 0) {
            int remainder = firstNumb % secondNumb;
            firstNumb = secondNumb;
            secondNumb = remainder;
        }

        return firstNumb;
    }
}
