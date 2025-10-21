import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Time Complexity: O(N^2 * log(no. of unique triplets))
 * 
 * O(N^2) -> traverse with each element to find the triplet which sum to 0
 * O(log triplets) -> inserting elements into the set
 * 
 * 
 * Space Complexity: O(2 * no. of the unique triplets) + O(N)
 * 
 * O(2 * Triplet) - for unique triplets in the set and the answer list created at the end
 * O(N) -> hashset being created for every ith number
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // store each jth element to find element k which gives difference of 0
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                // to make the triplet zero find the negation of both numbers
                int thirdSum = -(nums[i] + nums[j]);

                if (hashset.contains(thirdSum)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], thirdSum);
                    Collections.sort(temp);
                    st.add(temp);
                }

                hashset.add(nums[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(nums);

        System.out.println(ans);
    }
}
