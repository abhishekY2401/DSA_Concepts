import java.util.*;

public class SubsetI {
    public static void subset(int i, List<Integer> sub, List<List<Integer>> res, int[] nums) {
        if (i == nums.length) {
            res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        subset(i + 1, sub, res, nums);
        sub.remove(sub.size() - 1);
        subset(i + 1, sub, res, nums);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        subset(0, sub, res, nums);
        System.out.println(res);
    }
}
