import java.util.Scanner;

public class BinaryNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
        boolean flagR = false;
        boolean flagC = false;

        // 0, 1 -> TRUE, FALSE
        for (int row = 0; row < n; row++) {
            flagC = flagR;
            for (int col = 0; col <= row; col++) {
                if (flagC == false) {
                    System.out.print("1 ");
                    flagC = true;
                } else {
                    System.out.print("0 ");
                    flagC = false;
                }
            }
            if (flagR == false) {
                flagR = true;
            } else {
                flagR = false;
            }
            System.out.println();
        }
    }
}
