import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        if (a > 0 && b > 0) {
            if (b > a) {
                return gcd(a, b % a);
            } else {
                return gcd(a % b, b);
            }
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of two numbers " + a + " and " + b + " is " + gcd(a, b));

        sc.close();
    }
}
