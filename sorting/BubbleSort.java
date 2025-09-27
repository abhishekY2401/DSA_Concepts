package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort algorithm
        Scanner sc = new Scanner(System.in);
        boolean swapped;
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int len = arr.length;

        // After each pass, the largest unsorted element moves to its correct position
        // at the end, Hence, after the ith pass, the last i elements are already
        // sorted.
        // 23 45 12 78
        // 0 1 2 3

        /*
         * first pass
         * 23 45 12 78 -> 23 45 12 78, i = 0, j = 1 (swapped = false)
         * 23 45 12 78 -> 23 12 45 78, i = 0, j = 2 (swapped = true)
         * 23 12 45 78 -> 12 23 45 78, i = 1, j = 1 (swapped = true)
         * 12 23 45 78 -> 12 23 45 78, i = 1, j = 2 (swapped = false)
         * 
         * sorted arr -> 12 23 45 78
         * 
         */
        for (int i = 0; i < len - 1; i++) {
            swapped = false;
            for (int j = 1; j < len - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }

            // this identifies whether two elements were swapped or not in the inner loop,
            // which also saves the remaining iterations.
            if (swapped == false) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
