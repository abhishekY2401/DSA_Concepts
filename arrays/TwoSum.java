import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

public class TwoSum {

    // using hashmap approach
    public static int[] twoSumMap(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (mp.containsKey(diff)) {
                int ind = mp.get(diff);
                return new int[] { ind, i };
            } else {
                mp.put(nums[i], i);
            }
        }

        return new int[] { -1, -1 };
    }

    // using 2 pointers approach
    public static String twoSumPtrs(int[] nums, int target) {
        // sort the array to adjust the sum of left and right elements
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum < target) {
                // if sum is less than target then increment left ptr
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] resMap = twoSumMap(nums, target);
        String resPtrs = twoSumPtrs(nums, target);

        System.out.println("Using hashmap approach: ");
        for (int i = 0; i < resMap.length; i++) {
            System.out.print(resMap[i] + " ");
        }

        if (resPtrs == "YES")
            System.out.println("There exists 2 elements in nums which sums upto target");
        else
            System.out.println("There does not exist 2 elements in nums which sums upto target");
        sc.close();
    }
}
