public class CompositeNumberCounter {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 4, 6, 8, 9, 11, 15};
        int compositeCount = 0;
        for (int num : arr) {
            if (isComposite(num) == 1) {
                compositeCount++;
            }
        }
        System.out.println("Number of composite numbers: " + compositeCount);
    }
    private static int isComposite(int num) {
        if (num <= 1) {
            return 0; // Not composite
        }
        if (num == 2 || num == 3) {
            return 0; // 2 and 3 are prime, not composite
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return 1; // Divisible by 2 or 3 means composite
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return 1; // Number is composite
            }
        }
        return 0; // Number is not composite
    }
}
