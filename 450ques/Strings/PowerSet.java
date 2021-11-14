import java.util.*;

/**
 * print all the SubStrings of the given String
 *
 * recursive approach
 *
 */
class PowerSet{

	//list for the Result
	static ArrayList<String>res=new ArrayList<>();

	public static    void  getPowerSet(String s,String ans){
		if(s.length()==0){
			res.add(ans);
			return;
		}
		
		// case 1 choosing the cahr 
		getPowerSet(s.substring(1),ans+s.charAt(0));

		//case 2 ignoring the char
		getPowerSet(s.substring(1),ans);

		
	}
	public static void main(String [] args	){
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the String ");
		String s=sc.next();

		getPowerSet(s,"");

		System.out.println(res);

	}
}

