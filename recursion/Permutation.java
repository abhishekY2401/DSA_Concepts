class Permutation {
    public void f(int i, List<Integer> sub, List<List<Integer>> res, boolean[] vis, int[] nums, int n) {
        if (i >= n) {
            if (sub.size() == n) {
                res.add(new ArrayList<>(sub));
            }
            return;
        }

        for (int j = 0; j < n; j++) {
            if (vis[j] == false) {
                vis[j] = true;
                sub.add(nums[j]);
                f(i + 1, sub, res, vis, nums, n);
                sub.remove(sub.size() - 1);
                vis[j] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        int n = nums.length;
        boolean[] vis = new boolean[n];
        f(0, sub, res, vis, nums, n);
        return res;
    }
}