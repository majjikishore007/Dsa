import java.util.*;

class MaxSumSubArrayK {
    static long bruteForce(int k, ArrayList<Integer> arr, int N) {
        /**
         * The first loop will go from i =0 to N-k
         * Then the second loop will go from j=i to =(i+k)-1
         * 
         * Time complexity is O(N*2)
         * Space complexity is O(1)
         */

        int max_sum = 0;
        for (int i = 0; i <= arr.size() - k; i++) {
            int curr = 0;
            for (int j = i; j <= (i + k) - 1; j++) {
                curr += arr.get(j);
            }
            max_sum = Math.max(max_sum, curr);
        }

        return max_sum;

    }

    static long maximumSumSubarray(int k, ArrayList<Integer> arr, int N) {
        /*
         * Uising sliding window technique
         * not doing any repeation
         * calculeate the window sum until the window size is achived
         * then slide the window by removing the start element and add the end element
         */
        int max_sum = 0;
        int i = 0, j = 0;
        int window_sum = 0;
        while (j < N) {
            if ((j - i) + 1 <= k) {
                window_sum += arr.get(j);
                j++;
            } else {
                window_sum -= arr.get(i);
                window_sum += arr.get(j);
                i += 1;
                j += 1;
            }
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

}