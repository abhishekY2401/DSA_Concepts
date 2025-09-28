package arrays;

import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int n = nums.length;
        int prev = nums[n - 1];

        for (int i = n - 1; i >= 0; i--) {
            if (i != 0) {
                int temp = nums[i - 1];
                nums[i - 1] = prev;
                prev = temp;
            } else {
                nums[n - 1] = prev;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}
