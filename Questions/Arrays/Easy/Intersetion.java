package Easy;

import java.util.ArrayList;
import java.util.List;

public class Intersetion {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> set = new ArrayList<Integer>();
        for (int i : nums1) {
            set.add(i);
        }

        List<Integer> set2 = new ArrayList<Integer>();
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
                set.remove(new Integer(i));
            }
        }

        int arr[] = new int[set2.size()];

        for (int i = 0; i < set2.size(); i++) {
            arr[i] = set2.get(i);
        }
        return arr;
    }
}
