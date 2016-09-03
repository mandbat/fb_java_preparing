package test;

import java.util.HashSet;
import java.util.Iterator;

public class App_136 {

	public static void main(String[] args) {
		System.out.println(reverseVowels(""));
	}

	private static int reverseVowels(String s) {
		int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7 };
		return singleNumber(a);
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
