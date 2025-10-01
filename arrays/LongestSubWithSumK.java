import java.util.Scanner;

public class LongestSubWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int k = sc.nextInt();

        // i = 0, j = 0
        // sum += j
        // 2 5 3 8 5
        int sum = 0;
        int i = 0;
        int maxLen = Integer.MIN_VALUE;

        for (int j = 0; j < arr.length; j++) {

            // add current element without worrying if it extends k or equals k
            sum += arr[j];

            // check if sum equals k
            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }

            // if sum is greater than k reduce the sum by subtracting ith element from left
            while (sum > k) {
                sum -= arr[i];
                i++;
            }
        }

        System.out.print(maxLen);

        sc.close();
    }
}