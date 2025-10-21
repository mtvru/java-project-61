package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 20;
    /**
     * Min step number.
     */
    private static final int MIN_STEP = 2;
    /**
     * Max step number.
     */
    private static final int MAX_STEP = 7;
    /**
     * Progression length.
     */
    private static final int PROGRESSION_LENGTH = 10;

    private Progression() {
        throw new UnsupportedOperationException();
    }

    /**
     * Play the game.
     */
    public static void play() {
        String[][] qaList = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            String hiddenNumber = "";
            StringBuilder question = new StringBuilder();
            int start = Utils.generateNumber(1, MAX_NUMBER);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
            String[] numbers = makeProgression(start, step, PROGRESSION_LENGTH);
            int hiddenIndex =  Utils.generateNumber(0, numbers.length - 1);

            for (int j = 0; j < numbers.length; j++) {
                if (hiddenIndex == j) {
                    question.append(".. ");
                    hiddenNumber = numbers[j];
                    continue;
                }

                question.append(numbers[j]).append(" ");
            }

            qaList[i][0] = question.toString();
            qaList[i][1] = hiddenNumber;
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "What number is missing in the progression?";
    }

    private static String[] makeProgression(
        final int start,
        final int step,
        final int length
    ) {
        String[] numbers = new String[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = String.valueOf(start + i * step);
        }

        return numbers;
    }
}
