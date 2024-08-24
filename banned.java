import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostFrequentWord {
    public static void main(String[] args) {
        String paragraph = "Ram hit a ball, the hit ball flew far after it was hit";
        String[] banned = {"hit"};

        // Convert paragraph to lowercase, remove punctuation, and split into words
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z]", " ").split("\\s+");

        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) bannedSet.add(word);

        Map<String, Integer> wordCount = new HashMap<>();
        String mostFrequentWord = "";
        int maxCount = 0;

        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                if (wordCount.get(word) > maxCount) {
                    mostFrequentWord = word;
                    maxCount = wordCount.get(word);
                }
            }
        }

        System.out.println("Output: \"" + mostFrequentWord + "\"");
    }
}
