/**
 * Time complexity O(N)
 * Space complexity O(1)
 */
class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		List<Integer> list = new ArrayList<>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum > 0) {
				list.add(sum);
			}
		}
		return list;
	}
}
