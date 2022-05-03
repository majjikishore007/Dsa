package basics;
class Main1 {
	static String integerToRoman(int num) {
		// add your logic here
		String m[] = new String[] { "", "M", "MM", "MMM" ,"MMMM"};
		String c[] = new String[] { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM " };
		String x[] = new String[] { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String i[] = new String[] { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

		String th = m[num / 1000];
		String hu = c[(num % 1000) / 100];
		String te = x[(num % 100)/10];
		String on = i[num % 10];
			
		String ans =th + hu + te + on;
		return ans;
	}
	
	public static void main(String[] args) {
			System.out.println(integerToRoman(3610));
	}
}