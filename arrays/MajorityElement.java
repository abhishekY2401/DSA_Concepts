import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    // N*logN time complexity
    // logN -> insertion of elements into map
    // N -> checking for N elements
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        int maxFreq = Integer.MIN_VALUE;
        int maxElement = 0;

        for (int i = 0; i < n; i++) {

            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);

            if (maxFreq < freq.get(nums[i])) {
                maxFreq = freq.get(nums[i]);
                maxElement = nums[i];

                if (maxFreq > n / 2)
                    return maxElement;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(nums);

        System.out.println(ans);
    }
}
