import java.util.Scanner;

class FindOddNumbersAfterN {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = input.nextInt();
        System.out.print("Hence the values printed for i are: ");
        for (int i =1; i < N; i+=2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
