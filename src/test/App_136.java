package test;

/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

import java.util.HashSet;
import java.util.Iterator;

public class App_136 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7 };
		System.out.println(singleNumber(a));
	}

	private static int singleNumber(int[] a) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (int n : a) {
			if (!set.add(n))
				set.remove(n);
		}
		Iterator<Integer> it = set.iterator();
		return it.next();

	}

}
