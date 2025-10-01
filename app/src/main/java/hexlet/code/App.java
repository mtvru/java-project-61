/**
 * This package contains the main application entry point and CLI greeting.
 */
package hexlet.code;

import java.util.Scanner;

public final class App {
    private App() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("0 - Exit");
            int gameNumber = scanner.nextInt();
            System.out.println(
                "Your choice: " + gameNumber + System.lineSeparator()
            );

            switch (gameNumber) {
                case 1:
                    Cli.greeting();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
