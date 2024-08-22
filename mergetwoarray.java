public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int mergedSize = n1 + n2;
        int[] merge = new int[mergedSize];
        for (int i = 0; i < n1; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            merge[i + n1] = arr2[i];
        }
        System.out.print("Merged Array: ");
        for (int i = 0; i < mergedSize; i++) {
            System.out.print(merge[i] + " ");
        }
        System.out.println();
    }
}
