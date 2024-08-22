public class LcmGcd {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int a=n1;
        int b=n2;
        int gcd = 0;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        gcd = a; 
        int lcm = (n1 * n2) / gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
