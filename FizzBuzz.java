import java.util.*;
class FizzBuzz{
	public static void fizzBuzz(int n){
		
		if(n%3==0){
			System.out.print("Fizz");
		}
		 if(n%5==0){
			System.out.print("Buzz");		
		}
		
	}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++){
		fizzBuzz(i);
	//	System.out.println();
		}
	}

}
