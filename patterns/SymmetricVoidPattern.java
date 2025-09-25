
import java.util.Scanner;

public class SymmetricVoidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            // print stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            int spaces = 2 * row;
            // print spaces
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            // print stars
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            int spaces = 2 * (n - row);
            // print spaces
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
