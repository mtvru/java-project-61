package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {
        throw new UnsupportedOperationException();
    }

    /**
     * Greeting.
     */
    public static void greet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
