import java.util.*;
import java.io.*;

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Your code here
        System.out.println("--------------------------------");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                list.add(arr[i - 1]);
                while (arr[i] < arr[i - 1]) {
                    System.out.print(i);
                    i++;
                }
            }
        }

        list.add(arr[n - 1]);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2 };
        leaders(arr, arr.length);
    }
}