import java.util.Scanner;
class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = input.nextInt();
        System.out.print("Enter the number of years: ");
        int t = input.nextInt();
        System.out.print("Is the customer a senior citizen (y/n): ");
        char ser = input.next().charAt(0);
        int r;
        if (ser == 'y' || ser == 'Y') {
            r = 12;
        } else if (ser == 'n' || ser == 'N') {
            r = 10;
        } 
        else{
            System.out.print("nothing");
            return;
        }
        int s = (p * t * r) / 100;
        System.out.println("The simple interest is: " + s);
    }
}
