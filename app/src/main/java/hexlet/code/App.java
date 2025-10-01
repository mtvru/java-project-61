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
        System.out.println("Welcome to the Brain Games!");
        Cli.greeting();
    }
}
