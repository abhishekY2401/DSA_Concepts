import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // store each jth element to find element k which gives difference of 0
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
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
