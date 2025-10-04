import java.util.ArrayList;
import java.util.List;

/*
 * O(N) + O(N/2) -> Time Complexity
 * 
 * O(N) -> filters out the positives and negatives in two seperate arrays
 * O(N/2) -> iterate over any positives or negatives and arrange them in alternate order 
 * 
 * O(N/2) + O(N/2) -> O(N) Space Complexity
 * 
 */

public class RearrangePosAndNeg {
    public static int[] rearrangeArray(int[] nums, int n) {

        List<Integer> ps = new ArrayList<>();
        List<Integer> ns = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                ps.add(nums[i]);
            else
                ns.add(nums[i]);
        }

        int j = 0, a = 0;
        while (a < ps.size()) {
            nums[j] = ps.get(a);
            nums[j + 1] = ns.get(a);
            j += 2;
            a++;
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int n = nums.length;
        nums = rearrangeArray(nums, n);

        for (int i = 0; i<n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
