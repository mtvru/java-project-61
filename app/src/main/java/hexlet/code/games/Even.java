package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
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
        String[][] qaList = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Utils.generateNumber(1, MAX_NUMBER);
            qaList[i][0] = String.valueOf(number);
            qaList[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    private static boolean isEven(final int number) {
        return number % 2 == 0;
    }
}
