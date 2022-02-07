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
		
		int res[]=new int [N-1];
		for (int i = 1; i < N; i++) {
			if (brr[i] - brr[i - 1] > 1) {
				res[i - 1] = getSum(brr[i - 1] + 1, brr[i] - 1);
			} else {
				res[i - 1] = 0;
			}
		}
		
		return res;
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
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("::::::::::::::::");
			int brr[] = getAns(arr, arr.length);

			for (int j : brr) {
				System.out.print(j + " ");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}