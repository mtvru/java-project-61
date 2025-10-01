package hexlet.code;

public final class Even {
    /**
     * Required correct answers.
     */
    private static final int REQUIRED_CORRECT_ANSWERS = 3;

    /**
     * Max random number.
     */
    private static final int MAX_NUMBER = 30;

    private Even() {
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param name player name
     */
    public static void play(final String name) {
            System.out.println(
                "Answer 'yes' if the number is even, otherwise answer 'no'."
            );

            for (int i = 0; i < REQUIRED_CORRECT_ANSWERS; i++) {
                int number = (int) (Math.random() * MAX_NUMBER);
                System.out.println("Question: " + number);
                String answer = Cli.getScanner().next();
                boolean correct = (number % 2 == 0) == (answer.equals("yes"));

                if (!correct) {
                    String correctAnswer = answer.equals("yes") ? "no" : "yes";
                    System.out.printf(
                        "'%s' is wrong answer ;(. Correct answer was '%s'%s",
                        answer, correctAnswer, System.lineSeparator()
                    );
                    System.out.println("Let's try again, " + name + "!");
                    return;
                }

                System.out.println("Correct!");
            }

            System.out.println("Congratulations, " +  name + "!");
    }
}
