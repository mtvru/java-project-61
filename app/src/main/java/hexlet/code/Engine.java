package hexlet.code;

import hexlet.code.games.GameInterface;

public final class Engine {
    /**
     * Required correct answers.
     */
    private static final int REQUIRED_CORRECT_ANSWERS = 3;

    private Engine() {
        throw new UnsupportedOperationException();
    }

    /**
     * Start the game.
     * @param name player
     * @param game selected game by player
     */
    public static void start(final String name, final GameInterface game) {
        System.out.println(game.description());

        for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
            System.out.println(game.question());
            String answer = Cli.getScanner().nextLine();
            System.out.println("Your answer: " + answer);

            if (!game.checkAnswer(answer)) {
                String correctAnswer = game.correctAnswer();
                System.out.printf(
                    "'%s' is wrong answer ;(. Correct answer was '%s'.%s",
                    answer, correctAnswer, System.lineSeparator()
                );
                System.out.println("Let's try again, " + name + "!");

                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
