import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n / 2 + 1; row++) {

            int spaces = n / 2 - row;

            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < 2 * row + 1; col++) {
                System.out.print("*");
            }

            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
