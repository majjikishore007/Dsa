package basics;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	public static int getInt(int num) {
		int ans=0;
		int index=0;
		while(num!=0) {
			ans+=(num%10)*Math.pow(2,index++);
			num=num/10;
		}
		return ans;
	}
	public  static boolean isPrime(int num) {
		if(num%2==0) {
			return false;
		}
		for(int i=3;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static  List<Integer>  getPrimeFromAtoB(int a,int  b) {
	    List<Integer>ans=new ArrayList<Integer>();
	    int  x = getInt(a);
	    int  y = getInt(b);
	
	    for (int i = x; i <= y; i++) {
	        if(isPrime(i)) {
	        	ans.add(i);
	        }
	    }
	    return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(getPrimeFromAtoB(101,11111));
	}
}
