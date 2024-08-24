public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};  // Input array
        int n = nums.length;  // Number of elements
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Output: " + missingNumber);
    }
}
