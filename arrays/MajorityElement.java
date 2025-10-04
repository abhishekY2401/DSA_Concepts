import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /*
     * O(2N) -> O(2) + O(N) time complexity
     * N -> traversing N elements in an array to count the freq of every element
     * N -> traversing N elements in an array to check whether the element is
     * greater than N/2
     * 
     * Space Complexity: O(1) -> No extra space being used
     */
    public static int majorityVotingElement(int[] nums) {
        int n = nums.length;
        // counting elements and store max freq element
        int count = 0, element = 0;

        for (int i = 0; i < n; i++) {
            // if count is 0, take the current element into consideration. count the current
            // element as 1 and store curr element
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (element == nums[i]) {
                count++;
            } else {
                count--;
            }
        }

        // check whether the stored element is greater than N/2
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count1++;
            }
        }
        if (count1 > n / 2) {
            return element;
        }
        return -1;
    }

    /*
     * O(N*logN) time complexity
     * logN -> for inserting elements into the hashmap
     * N -> traversing N elements in an array
     * 
     * O(N) space complexity - for distinct elements in array
     * O(K) space complexity - for K distinct elements in array
     * Using hashMap data structure
     */
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
        int ans = majorityVotingElement(nums);

        System.out.println(ans);
    }
}
