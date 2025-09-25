
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        /*
         *******
         * 
         * *
         * *
         * *
         *******
         * 
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int row = 0; row <= n - 2; row++) {
            System.out.print("*");

            for (int col = 0; col < n - 2; col++) {
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

}
