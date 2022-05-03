package questions.basics;

public class Slution01 {
	//To find Armstrong Number between two given number.
	public static void getFibonacci(int n) {
		int a=0;
		int b=1;
		for(int i=0;i< n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		getFibonacci(5);
	}
}
