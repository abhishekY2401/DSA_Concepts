package sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            // find min element from a[i .. n-1]
            int jMin = i;

            // compare with every element from a[i + 1 .. n - 1]
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[jMin]) {
                    jMin = j;
                }
            }

            if (jMin != i) {
                int temp = arr[jMin];
                arr[jMin] = arr[i];
                arr[i] = temp;
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

        selectionSort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
