package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App_350 {

	public static void main(String[] args) {
		int[] n1 = { 1, 2, 2, 3, 3, 4, 5 };
		int[] n2 = { 2, 1, 7, 5, 5 };
		System.out.println(Arrays.toString(intersect(n1, n2)));
	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);

			} else {
				map.put(i, 1);
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
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
