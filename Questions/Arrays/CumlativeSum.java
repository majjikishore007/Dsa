/**
 *  Time complexity O(N)
 *  space complexity O(1)
 *
 *
 */
class Solution {
	int[] getCumulativeSum (int[] arr) {
		// add your logic here
        int sum=0;
        for(int i=0;i<arr.legth;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        return arr;
	}

}

