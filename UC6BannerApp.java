    public class UC6BannerApp {

    // Static method for letter O
    static String[] getOPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** ")
        };
    }

    // Static method for letter P
    static String[] getPPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " ***** "),
                String.join("", "*      "),
                String.join("", "*      "),
                String.join("", "*      ")
        };
    }

    // Static method for letter S
    static String[] getSPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", "*      "),
                String.join("", "*      "),
                String.join("", " ***** "),
                String.join("", "      *"),
                String.join("", "      *"),
                String.join("", " ***** ")
        };
    }

    public static void main(String[] args) {

        String[] O1 = getOPattern();
        String[] O2 = getOPattern();
        String[] P  = getPPattern();
        String[] S  = getSPattern();

        // Print banner using loop
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O1[i] + "  " +
                    O2[i] + "  " +
                    P[i]  + "  " +
                    S[i]
            );
        }
    }
}
