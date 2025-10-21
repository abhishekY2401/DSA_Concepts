import java.util.Map;
import java.util.HashMap;

public class CountSubarraysWithXorK {
    public static int countSubarrays(int[] nums, int n, int k) {
        int prefixXor = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(prefixXor, 1);

        for (int i = 0; i < n; i++) {
            // calculate XOR with current element
            prefixXor = prefixXor ^ nums[i];

            // calculate prefixXor with target k (prefixXor ^ k)
            int x = prefixXor ^ k;

            if (map.containsKey(x)) {
                count += map.get(x);
            }

            if (map.containsKey(prefixXor)) {
                map.put(prefixXor, map.get(prefixXor) + 1);
            } else {
                map.put(prefixXor, 1);
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 2, 6, 4 };
        int k = 6;
        int n = nums.length;
        int count = countSubarrays(nums, n, k);

        System.out.println("Count of subarray whose XOR is equals k: " + count);
    }
}
