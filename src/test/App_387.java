package test;

/*
 * First Unique Character in a String
 * 
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class App_387 {

	public static void main(String[] args) {
		System.out.println(reverseVowels("dddccdbba"));
	}

	private static int reverseVowels(String s) {

		char[] ch = s.toCharArray();

		int i = 0;
		for (char c : ch) {
			if (c == '0') {
				i++;
				continue;
			}
			boolean pr = true;
			int j = i + 1;
			while (j < ch.length) {
				if (c == ch[j]) {
					pr = false;
					ch[j] = '0';
				}
				j++;
			}
			if (pr)
				return i;
			else
				ch[i] = '0';
			i++;
		}
		return -1;
	}

}
