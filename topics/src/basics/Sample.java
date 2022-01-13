package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		List<String> inputByLine = new ArrayList<String>();
		List<Integer> list = new LinkedList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (String s : inputByLine) {
			int i = Integer.parseInt(s);
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			entry.getKey()
		}
	}
}
