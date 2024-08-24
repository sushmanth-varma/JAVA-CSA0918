# Overload

public class Overload {
    public void assignValues(int a) {
        System.out.println("Value of a: " + a);
    }

    public void assignValues(int a, int b) {
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.assignValues(5);
        obj.assignValues(10, 20);
    }
}
