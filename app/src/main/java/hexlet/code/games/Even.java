package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    /**
     * Number of questions.
     */
    private static final int NUMBER_OF_QUESTIONS = 3;

    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 30;

    private Even() {
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
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    private static String answer(final int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }
}
