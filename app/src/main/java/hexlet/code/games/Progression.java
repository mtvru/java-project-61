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
            int start = Utils.generateNumber(1, MAX_NUMBER);
            int step = Utils.generateNumber(MIN_STEP, MAX_STEP);
            int length = PROGRESSION_LENGTH;
            String[] progression = makeProgression(start, step, length);
            int maxNumber = progression.length - 1;
            int hiddenMemberIndex =  Utils.generateNumber(0, maxNumber);
            String answer = progression[hiddenMemberIndex];
            progression[hiddenMemberIndex] = "..";
            String question = String.join(" ", progression);
            qaList[i][0] = question;
            qaList[i][1] = answer;
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
