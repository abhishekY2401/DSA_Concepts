import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static int[][] merge(int[][] intervals) {

        // sort array intervals based on starting point
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        while (i < n) {
            // get the start and end of the current interval
            int start = intervals[i][0];
            int end = intervals[i][1];
            int j = i + 1;

            // compare with the start of the next interval and current's end
            while (j < n && intervals[j][0] <= end) {
                end = Math.max(end, intervals[j][1]);
                j++;
            }

            ans.add(new int[] { start, end });
            i = j;
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 4 }, { 5, 7 }, { 6, 8 } };
        int[][] mergedIntervals = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
