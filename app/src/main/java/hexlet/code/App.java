/**
 * This package contains the main application entry point and CLI greeting.
 */
package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public final class App {
    /**
     * Greet game number.
     */
    private static final int GREET_NUMBER = 1;
    /**
     * Even game number.
     */
    private static final int EVEN_NUMBER = 2;
    /**
     * Calc game number.
     */
    private static final int CALC_NUMBER = 3;
    /**
     * GCD game number.
     */
    private static final int GCD_NUMBER = 4;
    /**
     * Progression game number.
     */
    private static final int PROGRESSION_NUMBER = 5;
    /**
     * Prime game number.
     */
    private static final int PRIME_NUMBER = 6;

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
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print(System.lineSeparator());

        switch (gameNumber) {
            case GREET_NUMBER:
                Cli.greet();
                break;
            case EVEN_NUMBER:
                Even.play();
                break;
            case CALC_NUMBER:
                Calc.play();
                break;
            case GCD_NUMBER:
                Gcd.play();
                break;
            case PROGRESSION_NUMBER:
                Progression.play();
                break;
            case PRIME_NUMBER:
                Prime.play();
                break;
            default:
                System.exit(0);
        }
    }
}
