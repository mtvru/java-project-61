/**
 * This package contains the main application entry point and CLI greeting.
 */
package hexlet.code;

public final class App {
    private App() {
        throw new UnsupportedOperationException();
    }

    /**
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        int gameNumber = Cli.getScanner().nextInt();
        System.out.println(
            "Your choice: " + gameNumber + System.lineSeparator()
        );

        switch (gameNumber) {
            case 1:
                Cli.greeting();
                break;
            case 2:
                String name = Cli.greeting();
                Even.play(name);
                break;
            default:
                System.exit(0);
        }

        Cli.closeScanner();
    }
}
