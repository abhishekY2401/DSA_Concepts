
import java.util.Scanner;

public class ReverseLetterTriangle {
    public static void main(String[] args) {
        int c = 65;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                int ch = c + col;
                System.out.print((char) ch + " ");
            }
            System.out.println();
        }
        // System.out.print((char) c);

    }
}
