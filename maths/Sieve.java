import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Sieve {

    public static void main(String[] args) {
        // Sieve of erathosthenes
        // finding all primes in range of numbers from 2 to n

        Scanner sc = new Scanner(System.in);
        List<Integer> ans = new ArrayList<>();
        int n = sc.nextInt();

        boolean[] primes = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            primes[i] = true;
        }
        int p = 2;

        // mark all the multiples of p as false
        while (p * p <= n) {
            if (primes[p]) {
                for (int i = p * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
            p += 1;
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                ans.add(i);
            }
        }

        System.out.println(ans);
    }
}