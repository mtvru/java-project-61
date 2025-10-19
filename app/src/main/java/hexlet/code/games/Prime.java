package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    /**
     * Number of questions.
     */
    private static final int NUMBER_OF_QUESTIONS = 3;
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

    private Prime() {
        throw new UnsupportedOperationException();
    }

    /**
     * Play the game.
     */
    public static void play() {
        String[][] qaList = new String[NUMBER_OF_QUESTIONS][2];

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int number = Utils.generateNumber(1, MAX_NUMBER);
            qaList[i][0] = "Question: " + number;
            qaList[i][1] = answer(number);
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static String answer(final int number) {
        return isPrime(number) ? "yes" : "no";
    }

    private static boolean isPrime(final int number) {
        if (number < EVEN_NUMBER) {
            return false;
        } else if (number == EVEN_NUMBER) {
            return true;
        } else if (number % EVEN_NUMBER == 0) {
            return false;
        }

        int sqrtN = (int) Math.sqrt(number);

        for (int i = ODD_NUMBER; i <= sqrtN; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
