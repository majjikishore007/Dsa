package basics;

import java.util.Scanner;

public class Solution {
	public static int[] getAns(int[] arr, int N) {

		int brr[] = new int[N];
		int j = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] < 0) {
				brr[j++] = arr[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (arr[i] > 0) {
				brr[j++] = arr[i];
			}
		}
		for (int i = 1; i < N; i++) {
			if (brr[i] - brr[i - 1] > 1) {
				System.out.println(brr[i] + " and " + brr[i - 1]);
				arr[i - 1] = getSum(brr[i - 1] + 1, brr[i] - 1);
			} else {
				arr[i - 1] = 0;
			}
		}

		return arr;
	}

	private static int getSum(int i, int j) {
		int sum = 0;
		while (i <= j) {
			sum += i;
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the len");
			int N = sc.nextInt();
			int arr[] = new int[N];
			int i = 0;
			while (i++ < N) {
				arr[i] = sc.nextInt();
			}

			int brr[] = getAns(arr, arr.length);

			for (int j : brr) {
				System.out.print(j + " ");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
