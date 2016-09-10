package test;

/*
 * Reverse Vowels of a String  
 * 
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * Example 1:
 * Given s = "hello", return "holle".
 * Example 2:
 * Given s = "leetcode", return "leotcede".
 * Note:The vowels does not include the letter "y".
 */

public class App_345 {

	static String vow = "aeiouAEIOU";

	public static void main(String[] args) {
		System.out.println(reverseVowels("aA"));
	}

	private static String reverseVowels(String str) {
		char[] chA = str.toCharArray();
		int beg = 0;
		int end = chA.length - 1;
		char temp;
		while (beg < end) {

			while (vow.indexOf(chA[beg]) == -1 && beg < end) {
				beg++;
			}
			while (vow.indexOf(chA[end]) == -1 && beg < end) {
				end--;
			}

			temp = chA[beg];
			chA[beg] = chA[end];
			chA[end] = temp;

			beg++;
			end--;

		}

		return new String(chA);
	}

}
