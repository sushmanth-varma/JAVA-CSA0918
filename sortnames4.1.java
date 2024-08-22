import java.util.Arrays;

class SortNames {
    public static void main(String[] args) {
        // Hardcoded list of names
        String[] names = {"Banana", "Carrot", "Radish", "Apple", "Jack"};
        char order = 'A'; // Change this to 'D' for descending order
        if (order == 'A' || order == 'a') {
            Arrays.sort(names);
        } else if (order == 'D' || order == 'd') {
            Arrays.sort(names, (a, b) -> b.compareTo(a));
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
