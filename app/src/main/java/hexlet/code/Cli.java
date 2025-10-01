package hexlet.code;

import java.util.Scanner;

public final class Cli {
    /**
     * Single scanner for whole app.
     */
    private static Scanner scanner = new Scanner(System.in);

    private Cli() {
        throw new UnsupportedOperationException();
    }

    /**
     * Greeting by name.
     *
     * @return name
     */
    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = getScanner().nextLine();
        System.out.println("Hello, " + name + "!");

        return name;
    }

    /**
     * @return scanner
     */
    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * Close scanner.
     */
    public static void closeScanner() {
        scanner.close();
    }
}
