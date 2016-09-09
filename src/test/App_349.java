package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class App_349 {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 2, 3 };
		int[] a2 = { 2, 2, 1 };
		System.out.println(Arrays.toString(intersection(a1, a2)));
	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);

			} else {
				map.put(i, 1);
			}
		}

		HashSet<Integer> list = new HashSet<>();
		for (int i : nums2) {
			if (map.containsKey(i)) {
				if (map.get(i) > 1) {
					map.put(i, map.get(i) - 1);
				} else {
					map.remove(i);
				}
				list.add(i);
			}
		}

		int[] result = new int[list.size()];
		int i = 0;
		for (int k : list) {
			result[i] = k;
			i++;
		}
		return result;
	}

}
