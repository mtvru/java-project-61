package hexlet.code.games;

import java.util.Random;
import java.util.random.RandomGenerator;

public final class Progression implements GameInterface {
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

    /**
     * Hidden number.
     */
    private int hiddenNumber;

    @Override
    public String description() {
        return "What number is missing in the progression?";
    }

    @Override
    public String question() {
        StringBuilder question = new StringBuilder("Question: ");
        int[] numbers = getNumbers();
        int hiddenIndex =  new Random().nextInt(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            if (hiddenIndex == i) {
                question.append(".. ");
                this.hiddenNumber = numbers[i];
                continue;
            }

            question.append(numbers[i]).append(" ");
        }

        return question.toString();
    }

    @Override
    public boolean checkAnswer(final String answer) {
        return this.hiddenNumber == Integer.parseInt(answer);
    }

    @Override
    public String correctAnswer() {
        return String.valueOf(this.hiddenNumber);
    }

    private int[] getNumbers() {
        int[] numbers = new int[PROGRESSION_LENGTH];
        int start = new Random().nextInt(MAX_NUMBER);
        int step = RandomGenerator.getDefault().nextInt(MIN_STEP, MAX_STEP);

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            numbers[i] = start + i * step;
        }

        return numbers;
    }
}
