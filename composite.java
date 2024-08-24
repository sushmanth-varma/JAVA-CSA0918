# Composite Numbers Between A and B

import java.util.Scanner;

public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();

        System.out.print("Composite numbers between " + a + " and " + b + " are: ");
        for (int i = a; i <= b; i++) {
            if (i > 1) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count > 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
