package test;

/*
 * Write a function that takes a string as input and returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 */

public class App_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("hello"));

	}

	private static String reverseString(String s) {
		char[] charArray = s.toCharArray();
		int beg = 0;
		int end = charArray.length - 1;
		char temp;
		while (end > beg) {
			temp = charArray[beg];
			charArray[beg] = charArray[end];
			charArray[end] = temp;
			end--;
			beg++;
		}
		return new String(charArray);
	}
}
