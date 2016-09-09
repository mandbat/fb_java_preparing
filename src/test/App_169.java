package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App_169 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6 };
		System.out.println(majorityElement(n));
	}

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		Iterator<Entry<Integer, Integer>> entries = map.entrySet().iterator();
		int max = 0;
		int number = 0;
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) entries.next();
			if (entry.getValue() > max) {
				max = entry.getValue();
				number = entry.getKey();
			}
		}

		return number;
	}

}
