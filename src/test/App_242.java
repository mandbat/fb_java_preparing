package test;

/*
 * Valid Anagram  
 * 
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */

import java.util.HashMap;

public class App_242 {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		if (s == null && t == null)
			return true;
		if (s.length() == 0 && t.length() == 0)
			return true;
		if (s.length() != t.length())
			return false;

		char[] chS = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : chS) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else
				map.put(c, 1);
		}

		char[] chT = t.toCharArray();
		for (char c : chT) {
			if (map.containsKey(c)) {
				int count = map.get(c);
				if (count > 1) {
					map.put(c, count - 1);
				} else
					map.remove(c);
			} else
				return false;
		}
		return (map.size() == 0 ? true : false);
	}
}
