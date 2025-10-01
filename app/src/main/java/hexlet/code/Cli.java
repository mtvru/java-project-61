package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {
        throw new UnsupportedOperationException();
    }

    /**
     * Greeting by name.
     */
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
