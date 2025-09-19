import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public void f(int i, List<Integer> sub, List<List<Integer>> res, int[] c, int k, int t, int n) {
        if (i > n) {
            return;
        }
        if (sub.size() == k && t == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for (int j = i; j < n; j++) {
            if (t - c[j] >= 0) {
                sub.add(c[j]);
                f(j + 1, sub, res, c, k, t - c[j], n);
                sub.remove(sub.size() - 1);
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] c = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int len = c.length;
        f(0, sub, res, c, k, n, len);

        return res;
    }
}
