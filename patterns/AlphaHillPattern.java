
import java.util.Scanner;

public class AlphaHillPattern {
    public static void main(String[] args) {
        int c = 65;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            int spaces = n - row;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                int ch = c + col;
                System.out.print((char) ch);
            }

            for (int col = row - 1; col >= 0; col--) {
                int ch = c + col;
                System.out.print((char) ch);
            }
            System.out.println();
        }
    }
}
