public class NumberPattern {
    public static void main(String[] args) {
        int number = 1; // Number to be printed
        int maxTimes = 3; // Max number of times the number is printed
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
        for (int i = maxTimes - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
