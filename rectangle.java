public class RectanglePattern {
    public static void main(String[] args) {
        int rows = 4;    // Number of rows in the rectangle
        int columns = 6; // Number of columns in the rectangle
        char symbol = '*'; // Symbol to print in the pattern

        // Print the rectangle pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println(); // Move to the next line after printing all columns
        }
    }
}
