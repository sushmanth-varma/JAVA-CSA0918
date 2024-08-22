public class ConsonantVowelSeparator {
    public static void main(String[] args) {
        // Example input word
        String input = "Engineering";
        input = input.toLowerCase();
        String consonants = "";
        String vowels = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels += ch + " ";
            }
            else if (Character.isLetter(ch)) {
                consonants += ch + " ";
            }
        }
        System.out.println("Consonants: " + consonants.trim());
        System.out.println("Vowels: " + vowels.trim());
    }
}
