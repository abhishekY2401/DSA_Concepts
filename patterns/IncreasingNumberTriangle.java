
import java.util.Scanner;

public class IncreasingNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur = 1;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(cur + " ");
                cur++;
            }
            System.out.println();
        }
    }
}
