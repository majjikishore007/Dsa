public class MergeTwoSortedArrays {
    int[] mergeSortedArrays(int[] A, int[] B) {
        // add your logic here
        int len = A.length + B.length;
        int arr[] = new int[len];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                arr[k++] = A[i++];
            } else {
                arr[k++] = B[j++];
            }
        }
        while (i < A.length) {
            arr[k++] = A[i++];
        }
        while (j < B.length) {
            arr[k++] = B[j++];
        }
        return arr;
    }
}
