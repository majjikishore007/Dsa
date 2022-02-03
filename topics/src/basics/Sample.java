package basics;

public class Sample {
	static int ans=0;
	public static void getRev(int n) {
		if(n==0) {
			return;
		}
		int rem=n%10;
		ans=rem+(ans*10);
		
		getRev(n/10);
	}
	
	public static int method2(int num,int rev) {
		
			if(num==0) {
				return rev;
			}		
			rev=(num%10)+(rev*10);
			
		return method2(num/10, rev);
	}
	public static int getRev2(int n) {
		int rev=0;
		return method2(n, rev);
	}
	public static void main(String[] args) {
		
		System.out.println(getRev2(1234));
//		System.out.println("trail  ::::"+(3>>2));
	}
}
