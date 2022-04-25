/**
 * time complexity O(N*2)
 * space complexity O(1)
 */

public class BubbleaSort {
    static void bubbleaSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    // swap the both
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 2, 3, 10, 4 };
        bubbleaSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
