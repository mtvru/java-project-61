package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    /**
     * Number of questions.
     */
    private static final int NUMBER_OF_QUESTIONS = 3;
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
        String[][] qaList = new String[NUMBER_OF_QUESTIONS][2];

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            int hiddenNumber = 0;
            StringBuilder question = new StringBuilder("Question: ");
            int[] numbers = getNumbers();
            int hiddenIndex =  Utils.generateNumber(0, numbers.length - 1);

            for (int j = 0; j < numbers.length; j++) {
                if (hiddenIndex == j) {
                    question.append(".. ");
                    hiddenNumber = numbers[i];
                    continue;
                }

                question.append(numbers[i]).append(" ");
            }

            qaList[i][0] = question.toString();
            qaList[i][1] = answer(hiddenNumber);
        }

        Engine.run(description(), qaList);
    }

    private static String description() {
        return "What number is missing in the progression?";
    }

    private static String answer(final int number) {
        return String.valueOf(number);
    }

    private static int[] getNumbers() {
        int[] numbers = new int[PROGRESSION_LENGTH];
        int start = Utils.generateNumber(1, MAX_NUMBER);
        int step = Utils.generateNumber(MIN_STEP, MAX_STEP);

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            numbers[i] = start + i * step;
        }

        return numbers;
    }
}
