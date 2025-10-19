package hexlet.code;

public final class Utils {
    private Utils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Generate random number.
     * @param min number
     * @param max number
     * @return number
     */
    public static int generateNumber(final int min, final int max) {
        return (int) Math.floor(Math.random() * (max - min + 1)) + min;
    }
}
