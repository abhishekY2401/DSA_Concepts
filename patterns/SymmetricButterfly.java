
import java.util.Scanner;

public class SymmetricButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            // print stars
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }

            // print spaces
            int spaces = 2 * (n - row);
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            // print stars
            for (int col = n - row; col > 0; col--) {
                System.out.print("*");
            }

            // print spaces
            int spaces = 2 * row;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            // print stars
            for (int col = n - row; col > 0; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
