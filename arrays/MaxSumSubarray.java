public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, -1, -5, 4 };
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // whatever maxSum we take, be sure to capture the start and end index for max
            // subarray
            if (maxSum < sum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            // if sum becomes less than 0, then tempStart will start from next index
            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Maximum sum: " + maxSum);
        System.out.print("Maximum subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i != end) {
                System.out.print(", ");
            }
        }
    }
}

/*
 * Time Complexity: O(N)
 * O(N) as we traverse the whole array once.
 * Space Complexity: O(1)
 * O(1) because we are not using any extra space for storing just the two
 * indexes start and end help us to retrieve the max subarray from the main
 * array
 */
