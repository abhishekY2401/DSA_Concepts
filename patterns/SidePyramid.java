import java.util.Scanner;

public class SidePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int row = n - 1; row > 0; row--) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
