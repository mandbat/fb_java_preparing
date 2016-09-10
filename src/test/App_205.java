package test;

/*
 * Isomorphic Strings  
 * 
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 * 
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 */

import java.util.HashMap;

public class App_205 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("almmutk", "cvppcgh"));
	}

	private static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (map.containsKey(ch1)) {
				if (map.get(ch1) != ch2)
					return false;
			} else {
				if (map.containsValue(ch2))
					return false;
				map.put(ch1, ch2);
			}
		}

		return true;
	}
}
