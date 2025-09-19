import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public void f(int i, List<Integer> sub, List<List<Integer>> res, int[] c, int t, int n) {

        if (t == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for (int j = i; j < n; j++) {
            if (j > i && c[j] == c[j - 1]) {
                continue;
            }

            if (t - c[j] >= 0) {
                sub.add(c[j]);
                f(j + 1, sub, res, c, t - c[j], n);
                sub.remove(sub.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int n = candidates.length;
        Arrays.sort(candidates);
        f(0, sub, res, candidates, target, n);

        return res;
    }
}
