import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }

            int spaces = (2 * n) - (2 * row);
            for (int col = 1; col <= spaces; col++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
