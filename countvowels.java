public class VowelCounter {
    public static void main(String[] args) {
        // Example input string
        String input = "Saveetha School of Engineering";
        input = input.toLowerCase();
        int vowelCount = 0;
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels = " + vowelCount);
    }
}
