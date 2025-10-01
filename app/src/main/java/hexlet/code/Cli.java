package hexlet.code;

import java.util.Scanner;

public class Cli {
    protected Cli() {
        throw new UnsupportedOperationException();
    }

    /**
     * Greeting by name.
     */
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
