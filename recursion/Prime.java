import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n, int i) {
        if (i * i > n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return checkPrime(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number " + n + " is prime: " + checkPrime(n, 2));
        sc.close();
    }
}
