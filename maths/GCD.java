
import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        int gcd = Integer.MIN_VALUE;
        int min = Math.min(a, b);

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = Math.max(gcd, i);
            }
        }

        return gcd;
    }

    // public static int gcd(int a, int b) {
    // while (a != 0 && b != 0) {
    // if (a >= b) {
    // a = a % b;
    // } else {
    // b = b % a;
    // }
    // }

    // if (a == 0) return b;

    // return a;
    // }
    public static void main(String[] args) {
        // gcd and lcm
        // greatest common divisor is a largest integer that divides both given numbers.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = gcd(a, b);
        System.out.println(ans);
    }

}
