import java.util.Scanner;

public class MoveZeroes {
    public static void moveZeroes(int[] arr) {
        // keeps track of number of zeroes
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] != 0) {
                int temp = arr[i - count];
                arr[i - count] = arr[i + 1];
                arr[i + 1] = temp;
            } else if (arr[i] == 0 && arr[i + 1] == 0) {
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}