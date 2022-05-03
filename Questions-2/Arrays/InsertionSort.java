/**
 * The idea is that
 * compare the element with its previous value
 * until the previous is smaller check for its previous value
 * then finally drag the value to the current
 */
public class InsertionSort {
    void insertionSort(int[] arr) {
        // add your logic here
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];

            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
    }
}
