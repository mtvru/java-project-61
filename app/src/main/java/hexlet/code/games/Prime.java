package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 90;

    private Prime() {
        throw new UnsupportedOperationException();
    }

    /**
     * Play the game.
     */
    public static void play() {
        String[][] qaList = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(1, MAX_NUMBER);
            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";
            qaList[i][0] = question;
            qaList[i][1] = answer;
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static boolean isPrime(final int number) {
        final int evenNumber = 2;
        final int oddNumber = 3;

        if (number < evenNumber) {
            return false;
        } else if (number == evenNumber) {
            return true;
        } else if (number % evenNumber == 0) {
            return false;
        }

        int sqrtN = (int) Math.sqrt(number);

        for (int i = oddNumber; i <= sqrtN; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
