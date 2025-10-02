package hexlet.code.games;

public interface GameInterface {
    /**
     * Description of the Game.
     * @return game description
     */
    String description();

    /**
     * Question of the Game.
     * @return game question
     */
    String question();

    /**
     * Check answer.
     * @param answer player
     * @return boolean
     */
    boolean checkAnswer(String answer);

    /**
     * If checkAnswer is false, return correct answer.
     * @return correct answer
     */
    String correctAnswer();
}
