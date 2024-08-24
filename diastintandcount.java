import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount {
    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Integer> charCountMap = getDistinctCharacterCount(input);
        System.out.println("Character counts:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<Character, Integer> getDistinctCharacterCount(String str) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            // Increment count for each character
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }
}
