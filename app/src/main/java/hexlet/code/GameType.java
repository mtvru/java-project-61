package hexlet.code;

public enum GameType {
    /**
     * Greet game.
     */
    GREET(1, "Greet"),
    /**
     * Even game.
     */
    EVEN(2, "Even"),
    /**
     * Calculator game.
     */
    CALC(3, "Calc"),
    /**
     * Exit of the game.
     */
    EXIT(0, "Exit");

    /**
     * Game number.
     */
    private final int number;
    /**
     * Game title.
     */
    private final String title;

    /**
     * @param numberV game
     * @param titleV game
     */
    GameType(final int numberV, final String titleV) {
        this.number = numberV;
        this.title = titleV;
    }

    /**
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param number game
     * @return GameType
     */
    public static GameType fromNumber(final int number) {
        for (GameType game : values()) {
            if (game.getNumber() == number) {
                return game;
            }
        }

        return EXIT;
    }
}
