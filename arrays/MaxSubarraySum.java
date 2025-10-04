public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, -1, -5, 4 };
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (maxSum < sum) {
                maxSum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
    }
}

/*
 * Time Complexity: O(N)
 * O(N) as we traverse the whole array once.
 * Space Complexity: O(1)
 * O(1) because we are not using any extra space
 */
