import java.util.Arrays;

public class GenericSorter<T extends Comparable<T>> {

    private T[] array;

    // Constructor to initialize the array
    public GenericSorter(T[] array) {
        this.array = array;
    }

    // Method to sort the array
    public void sort() {
        Arrays.sort(array);
    }

    // Method to print the array
    public void printArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example with Integer array
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        GenericSorter<Integer> intSorter = new GenericSorter<>(intArray);
        System.out.println("Original Integer Array:");
        intSorter.printArray();
        intSorter.sort();
        System.out.println("Sorted Integer Array:");
        intSorter.printArray();

        // Example with String array
        String[] strArray = {"Banana", "Apple", "Cherry", "Mango"};
        GenericSorter<String> strSorter = new GenericSorter<>(strArray);
        System.out.println("Original String Array:");
        strSorter.printArray();
        strSorter.sort();
        System.out.println("Sorted String Array:");
        strSorter.printArray();
    }
}
