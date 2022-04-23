import java.util.Map;

/**
 * Array: [1, 2, 3, 2, 1]
 * Number of Identical Twins: 2
 * Explanation:
 * Identical Twins: [[1, 1], [2, 2]]
 * Indexes: (0, 4), (1, 3)
 */

/**
 * Time complexity O(N)
 * Space complexity O(N)
 */
class Solution {
    int getIdenticalTwinsCount(int[] arr) {
        // add your logic here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) > 1) {
                ans += map.get(arr[i]) - 1;
                map.put(arr[i], map.get(arr[i]) - 1);
            }
        }
        return ans;
    }
}