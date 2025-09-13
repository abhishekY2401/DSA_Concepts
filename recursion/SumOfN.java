import java.util.Scanner;

public class SumOfN {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        // add previous n numbers
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural number is " + sum(n));
        sc.close();
    }
}
