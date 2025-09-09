public class Print {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The numbers to be printed from 1 to " + n + " are:");
        print1ToN(1, n);
        System.out.println("The numbers to be printed from " + n + " to 1 are:");
        printNTo1(n);
    }

    public static void print1ToN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print1ToN(i + 1, n);
    }

    public static void printNTo1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }
}
