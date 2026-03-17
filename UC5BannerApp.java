public class UC5BannerApp {

    public static void main(String[] args) {

        // Inline array initialization using String.join()
        String[] banner = {
            String.join("", " *****   *****   *****   ***** "),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", " *****   *****   *****   ***** "),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", "*     * *     * *     * *     *"),
            String.join("", " *****   *****   *****   ***** ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
