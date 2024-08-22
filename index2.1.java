import java.util.Scanner;
public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);
        int index = input.indexOf(searchChar);
        if (index != -1) {
            System.out.println(searchChar + " is found in the string at index: " + index);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}
