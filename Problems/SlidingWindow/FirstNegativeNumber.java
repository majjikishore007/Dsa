import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * the idea is to mantain the list of the negative elements
 * - so that we need to check for the negative elements again
 *- example [1 2 -3,4]
 * lets k =2
 * for the first window there is no  negtavie element so ans=0
 * and for the second window the again we start checking from 2 but we have already checked in the above example so no need to do so
 *
 * we just need a queue for holing the negative nubmers
 * so we need to mat
 *
 */
public class FirstNegativeNumber {

    public static long[] printFirstNegativeInteger(long[] arr, int N, int K) {
        long[] res = new long[N - K + 1];
        Queue<Long> tray = new LinkedList<>();
        int i = 0, j = 0;
        int index = 0;
        while (j <N) {
            if (arr[j] < 0) {
                tray.add(arr[j]);
            }
            if ((j - i) + 1 < K) {
                j += 1;
            } else {
                // checking for the negative element exits or not
                if (!tray.isEmpty()) {
                    long x = tray.peek();
                    res[index++] = x;
                    if (arr[i] == x) {
                        tray.poll();
                    }//else ans will be 0
                } else {
                    res[index++] = 0;
                }

                j += 1;
                i += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        long[] arr = new long[] { -8, 2, 3, -6, 10 };

        System.out.println(Arrays.toString(printFirstNegativeInteger(arr, arr.length, 2)));
    }
}
