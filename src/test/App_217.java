package test;

import java.util.HashSet;

public class App_217 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 5 };
		System.out.println(containsDuplicate(a));
	}

	public static boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length == 0)
			return false;

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : nums) {
			if (!set.add(i)) {
				return true;
			}
		}

		return false;

	}

}
