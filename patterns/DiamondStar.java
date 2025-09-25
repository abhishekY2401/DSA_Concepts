
import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            // print space
            for (int col = 0; col <= n - row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            // print space
            for (int col = 1; col < 2 * row; col++) {
                System.out.print(" ");
            }
            if (row != 0)
                System.out.print("*");
            System.out.println();
        }

        for (int row = n - 2; row >= 0; row--) {
            // print space
            for (int col = 0; col <= n - row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            // print space
            for (int col = 1; col < 2 * row; col++) {
                System.out.print(" ");
            }
            if (row != 0)
                System.out.print("*");
            System.out.println();
        }

    }

}
