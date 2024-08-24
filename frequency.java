import java.util.HashMap;
import java.util.Map;
public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        System.out.println("Element Frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
