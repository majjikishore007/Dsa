package trees;

import java.util.ArrayList;
import java.util.List;

public class Sample {
	public static List<String> resoveDuplicates(String[] names) {

		List<String> ans = new ArrayList<String>();
		int index = 0;
		for (String name : names) {
			if (ans.contains(name)) {
				String n = name + "(" + (index + 1) + ")";
				ans.add(n);
			} else {
				index = getNum(name);
				ans.add(name);
			}

		}
		return ans;
	}

	public static int getNum(String s) {
		String res = " ";
		int start = -1, end = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				start = i;
				break;
			}
		}
		if (start == -1) {
			return 1;
		}
		res = s.substring(start + 1, end - 1);

		return Integer.parseInt(res);
	}

	public static void main(String[] args) {
		String[] arr = new String[] { "naruto", "naruto(1)", "naruto(2)", "naruto(3)", "naruto" };
		System.out.println(resoveDuplicates(arr));
		// System.out.println(getNum("Valorant(1)"));
	}
}
