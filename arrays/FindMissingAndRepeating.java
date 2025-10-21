import java.util.HashMap;
import java.util.Map;

/*
 * Time Complexity of finding repeated and missing number - O(N)
 * Space Complexity - O(No of unique elements)
 */

public class FindMissingAndRepeating {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 5, 4, 6, 7, 5 };

        // find duplicate number from the array
        Map<Integer, Integer> mp = new HashMap<>();
        int duplicate = 0, n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (mp.containsKey(nums[i])) {
                duplicate = nums[i];
                sum -= duplicate;
            } else {
                mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            }
        }

        int SumOfN = n * (n + 1) / 2;
        int missing = SumOfN - sum;

        System.out.println("Repeated Number: " + duplicate);
        System.out.println("Missing Number: " + missing);
    }
}
