package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Time complexity O(NlogN)
 * space complexity o(N)
 */
class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();

        int curr[] = intervals[0];
        list.add(curr);

        for (int temp[] : intervals) {
            if (temp[1] >= curr[0]) {
                curr[0] = Math.max(curr[1], temp[1]);
            } else {
                curr = temp;
                list.add(curr);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {

    }
}