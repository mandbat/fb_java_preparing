package test;

/*
 * Majority Element  
 * 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App_169 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 2, 2, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
				9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };

		long d1s = System.currentTimeMillis();
		System.out.println("1. " + majorityElement(n));
		long d1f = System.currentTimeMillis();
		System.out.println(d1s + " " + d1f);

		long d2s = System.currentTimeMillis();
		System.out.println("2. " + majorityElement2(n));
		long d2f = System.currentTimeMillis();
		System.out.println(d2s + " " + d2f);

	}

	private static int majorityElement2(int[] nums) {

		Arrays.sort(nums);
		int prev = nums[0];
		int count = 1;
		int maxCount = 0;
		int num = nums[0];

		int i = 1;
		while (i < nums.length) {
			if (nums[i] == prev) {
				count++;
				i++;
			} else {
				if (maxCount < count) {
					maxCount = count;
					num = prev;
				}
				prev = nums[i];
				count = 1;
			}
		}
		if (maxCount < count) {
			maxCount = count;
			num = prev;
		}

		return num;
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
