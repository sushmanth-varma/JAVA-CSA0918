import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String input = "This is a sample string with several words This string has some repeated words and some unique words";
        Map<String, Integer> wordCount = countWords(input);
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive counting
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        return wordCountMap;
    }
}
