
import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (row == n - 1) {
                System.out.print(" ");
                for (int col = 0; col <= row - 2; col++) {
                    System.out.print("* ");
                }
            }
            for (int col = 0; row != n - 1 && col < 2 * row - 1; col++) {
                System.out.print(" ");
            }
            if (row != 0)
                System.out.print("*");

            System.out.println();
        }
    }
}
