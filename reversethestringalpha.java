import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String input = scanner.nextLine();
        Character[] charArray = new Character[input.length()];
        for (int i = 0; i < input.length(); i++) {
            charArray[i] = input.charAt(i);
        }
        Arrays.sort(charArray, Collections.reverseOrder());
        System.out.print("Alphabetical Order: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
    }
}
