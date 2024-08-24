import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("Menu:");
            System.out.println("1. If Statement");
            System.out.println("2. Switch Statement");
            System.out.println("3. For Loop");
            System.out.println("4. While Loop");
            System.out.println("5. Do-While Loop");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display syntax of if statement
                    System.out.println("If Statement Syntax:");
                    System.out.println("if (condition) {");
                    System.out.println("    // code to be executed if condition is true");
                    System.out.println("}");
                    break;
                case 2:
                    // Display syntax of switch statement
                    System.out.println("Switch Statement Syntax:");
                    System.out.println("switch (expression) {");
                    System.out.println("    case value1:");
                    System.out.println("        // code to be executed if expression == value1");
                    System.out.println("        break;");
                    System.out.println("    case value2:");
                    System.out.println("        // code to be executed if expression == value2");
                    System.out.println("        break;");
                    System.out.println("    default:");
                    System.out.println("        // code to be executed if expression doesn't match any case");
                    System.out.println("}");
                    break;
                case 3:
                    // Display syntax of for loop
                    System.out.println("For Loop Syntax:");
                    System.out.println("for (initialization; condition; update) {");
                    System.out.println("    // code to be executed repeatedly");
                    System.out.println("}");
                    break;
                case 4:
                    // Display syntax of while loop
                    System.out.println("While Loop Syntax:");
                    System.out.println("while (condition) {");
                    System.out.println("    // code to be executed while condition is true");
                    System.out.println("}");
                    break;
                case 5:
                    // Display syntax of do-while loop
                    System.out.println("Do-While Loop Syntax:");
                    System.out.println("do {");
                    System.out.println("    // code to be executed at least once");
                    System.out.println("} while (condition);");
                    break;
                case 0:
                    // Exit the loop
                    System.out.println("Exiting...");
                    break;
                default:
                    // Handle invalid menu choices
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }

            System.out.println(); // Print a blank line for readability

        } while (choice != 0); // Continue the loop until the user chooses to exit

        scanner.close(); // Close the scanner
    }
}
