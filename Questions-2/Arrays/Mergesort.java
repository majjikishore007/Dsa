import java.util.Arrays;

class Mergesort {
	static void mergeSort(int[] arr) {
		// add your logic here
		helper(arr, 0, arr.length - 1);
	}

	public static void helper(int arr[], int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;

			helper(arr, low, mid);
			helper(arr, mid + 1, high);
			merge(low, high, mid, arr);
		}
	}

	public static void merge(int low, int high, int mid, int arr[]) {
		int left[] = Arrays.copyOfRange(arr, low, mid + 1);
		int right[] = Arrays.copyOfRange(arr, mid + 1, high + 1);

		int i = 0, j = 0, k = low;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 6, 70, 2, 3 };
		mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
