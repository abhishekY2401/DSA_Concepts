package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CheckArraySortedAndRotated {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {

            // check if current element is greater than next element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        // count returns whether an array can be sorted and rotated
        // if count is less than 1 or equals 1 than it can be sorted and rotated
        // if count is more than 1 then it cannot be rotated and sorted.
        return count <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        if (check(nums)) {
            System.out.println("The nums array " + Arrays.toString(nums) + " can be sorted and rotated");
        } else {
            System.out.println("The nums array " + Arrays.toString(nums) + " cannot be sorted and rotated");
        }

        sc.close();
    }
}
