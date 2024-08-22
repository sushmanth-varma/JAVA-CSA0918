public class InvertedPyramidPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid
        for (int i = n; i > 0; i--) {
            // Print leading spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
