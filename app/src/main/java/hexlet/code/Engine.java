package hexlet.code;

import java.util.Scanner;

public final class Engine {
    /**
     * Required correct answers.
     */
    private static final int REQUIRED_CORRECT_ANSWERS = 3;

    private Engine() {
        throw new UnsupportedOperationException();
    }

    /**
     * Run the game.
     * @param description description of the game displayed before questions.
     * @param qaList two-dimensional array of question–answer pairs.
     */
    public static void run(final String description, final String[][] qaList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (String[] qa : qaList) {
            System.out.println(qa[0]);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = qa[1];

            if (!answer.equals(correctAnswer)) {
                System.out.printf(
                    "'%s' is wrong answer ;(. Correct answer was '%s'.%s",
                    answer, correctAnswer, System.lineSeparator()
                );
                System.out.println("Let's try again, " + userName + "!");

                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
