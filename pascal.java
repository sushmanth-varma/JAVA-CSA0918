public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for Pascal's Triangle
        for (int i = 0; i < n; i++) {
            int coef = 1; // First element of each row is always 1
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                // Print the coefficient
                System.out.print(coef + " ");
                coef = coef * (i - k) / (k + 1);
            }
            
            System.out.println();
        }
    }
}
