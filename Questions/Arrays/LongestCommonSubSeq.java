// navie approach is here
// Time complexity: O(nlogn)
// space complexity: O(n)

// function (int arr[], int N)
// {
// // step1
// // Sort the array

// Array.sort(arr);

// //step2
// creating a list for storing the unique elements of array
// ArrayList<Integer> list = new ArrayList<Integer>();
// list.add(arr[0]);
// for(i=1; i<n;i++){
// if(arr[i]!=arr[i-1]){
// v.add(arr[i]);
// }
// }

// step3
// the final part of the algorithm to calculate the longestCommonSubSeq
// int count = 0;
// for(int i=0;i<v.size();i++){
// if(i>0 && v.get(i)==v.get(i-1)+1){
// count++;
// }
// else {
// count=1;
// }
// }
// }

// optimised approach
// time complexity : O(N)

// using of hashset

// //step1

// store the values in hashset
// hashset<Integer> set =new hashset();

// for i in n
// set.add(arr[i]);

// for(int i=0;i<n;i++){
// i
// }
import java.io.*;
import java.util.*;

class LongestCommonSubSeq {
    // arr[] : the input array
    // N : size of the array arr[]

    // Function to return length of longest subsequence of consecutive integers.
    static int findLongestConseqSubseq(int arr[], int N) {
        // add your code here
        System.out.println("hello");
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : arr) {
            set.add(i);
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (!set.contains(arr[i] - 1)) {

                int j = arr[i];
                while (set.contains(j)) {
                    j++;
                }

                if (ans < j - arr[i]) {
                    ans = j - arr[i];
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int n = arr.length;
        System.out.println("ans" + findLongestConseqSubseq(arr, n));
    }
}