package basics;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		List<Integer>res=new ArrayList<>();
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>=0) {
				res.add(sum);
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {

	}
}
