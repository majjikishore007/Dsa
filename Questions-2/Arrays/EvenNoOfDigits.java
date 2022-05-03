import java.util.ArrayList;
import java.util.List;

/**
 * Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
 * Answer: 42, 5775, 34, 45, 3556
 */
public class EvenNoOfDigits {
    List<Integer> getEvenDigitNumbers(int[] arr) {
        // add your logic here
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isEvenDigit(arr[i])) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    boolean isEvenDigitEfficient(int n) {
        int count = (int) (Math.log(n) + 1);
        if (count % 2 == 0)
            return true;
        return false;
    }

    boolean isEvenDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }
}
