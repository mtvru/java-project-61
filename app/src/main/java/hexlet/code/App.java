/**
 * This package contains the main application entry point and CLI greeting.
 */
package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;

public final class App {
    private App() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");

        for (GameType gameType : GameType.values()) {
            System.out.println(
                gameType.getNumber() + " - " + gameType.getTitle()
            );
        }

        int gameNumber = Cli.getScanner().nextInt();
        Cli.getScanner().nextLine();
        System.out.println(
            "Your choice: " + gameNumber + System.lineSeparator()
        );

        GameType gameType = GameType.fromNumber(gameNumber);
        String playerName;

        switch (gameType) {
            case GameType.GREET:
                Cli.greeting();
                break;
            case GameType.EVEN:
                playerName = Cli.greeting();
                Engine.start(playerName, new Even());
                break;
            case GameType.CALC:
                playerName = Cli.greeting();
                Engine.start(playerName, new Calc());
            case GameType.GCD:
                playerName = Cli.greeting();
                Engine.start(playerName, new Gcd());
            case GameType.PROGRESSION:
                playerName = Cli.greeting();
                Engine.start(playerName, new Progression());
                break;
            default:
                System.exit(0);
        }

        Cli.closeScanner();
    }
}
