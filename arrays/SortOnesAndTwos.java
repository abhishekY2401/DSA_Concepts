public class SortOnesAndTwos {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = { 0, 2, 2, 2, 1, 0, 2, 1, 0 };
        int n = nums.length;

        int low = 0, mid = 0, high = n - 1;
        // applying dutch flag national algorithm
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
