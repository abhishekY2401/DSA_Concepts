
import java.util.Scanner;

public class Reverse {
    public static long reverse(long num) {
        long rev = 0L;

        for (long n = num; n > 0;) {
            long rem = n % 10; // extracts last digit
            rev = rev * 10 + rem; // adds the last digit to rev
            n = n / 10; // extraction of digits from any sized number takes log to base 10 of N log10N.
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        long ans = reverse(num);
        System.out.println("The reverse of number " + num + " is " + ans);
    }

}
