public class MultiplicationTable {
    public static void main(String[] args) {
        int m = 4;  // The number for which the multiplication table is printed
        int n = 5;  // The number of entries in the table

        // Print the multiplication table
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "x" + m + "=" + (i * m));
        }
    }
}
