public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2},{5, 3}};
        int[][] mat2 = {{2, 3},{4, 1}};
        int[][] result = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
