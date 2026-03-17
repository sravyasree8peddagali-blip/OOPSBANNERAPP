import java.util.HashMap;
import java.util.Map;

public class UC8BannerApp {

    // Step 1: Build Character Patterns using HashMap
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Step 2: Render Banner
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int height = 5; // each character has 5 rows

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    // Step 3: Main Method
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, characterPatterns);
    }
}