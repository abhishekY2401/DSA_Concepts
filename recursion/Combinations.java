import java.util.*;

public class Combinations {
    public static void combine(int i, List<Integer> sub, List<List<Integer>> res, int[] nums) {
        if (i == nums.length) {
            if (sub.size() != 0)
                res.add(new ArrayList<>(sub));
            return;
        }

        sub.add(nums[i]);
        combine(i + 1, sub, res, nums);
        sub.remove(sub.size() - 1);
        combine(i + 1, sub, res, nums);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        combine(0, sub, res, nums);
        System.out.println(res);
    }
}