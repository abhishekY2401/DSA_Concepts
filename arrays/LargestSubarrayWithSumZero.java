import java.util.Map;
import java.util.HashMap;

public class LargestSubarrayWithSumZero {
    public static int subarraySum(int[] nums, int n) {
        int prefix = 0, maxLength = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            prefix += nums[i];

            if (prefix == 0) {
                maxLength = i + 1;
            }

            if (map.containsKey(prefix)) {
                maxLength = Math.max(maxLength, i - map.get(prefix));
            } else {
                map.put(prefix, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 6, -2, 2, -8, 1, 7, 4, -10 };
        int n = nums.length;
        int maxLength = subarraySum(nums, n);

        System.out.println("Maximum length of subarray whose sum is zero: " + maxLength);
    }
}
