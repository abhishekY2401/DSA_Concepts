package arrays;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] nums = { 23, 34, 56, 12, 78 };
        int n = nums.length;
        int[] temp = new int[n];
        int k = 3;

        // copy elements from nums to temp
        for (int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[(i + k) % n] = temp[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
