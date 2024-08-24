import java.util.Arrays;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};  // Input array

        int length = arr.length;
        int zerosToDuplicate = 0;

        // Count how many zeros can be duplicated without going out of bounds
        for (int i = 0; i < length - zerosToDuplicate; i++) {
            if (arr[i] == 0) {
                // If a zero at the end can't be fully duplicated, stop early
                if (i + zerosToDuplicate == length - 1) {
                    arr[length - 1] = 0;  // Duplicate the last zero
                    length -= 1;  // Reduce the length to avoid extra zero
                    break;
                }
                zerosToDuplicate++;
            }
        }

        // Start from the end, shifting and duplicating elements as necessary
        for (int i = length - zerosToDuplicate - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + zerosToDuplicate] = 0;  // Duplicate the zero
                zerosToDuplicate--;
                arr[i + zerosToDuplicate] = 0;  // Place the original zero
            } else {
                arr[i + zerosToDuplicate] = arr[i];  // Shift the element
            }
        }

        // Print the modified array
        System.out.println("Output: " + Arrays.toString(arr));
    }
}
