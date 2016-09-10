package test;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

public class App_258 {

	public static void main(String[] args) {
		int n = 123411233;
		System.out.println(addDigits(n));
	}

	private static int addDigits(int num) {

		while (num > 9) {

			char[] ch = ("" + num).toCharArray();
			int k = 0;
			for (char c : ch) {
				k = k + Integer.valueOf(String.valueOf(c));
			}
			num = k;

		}
		return num;

		// return num - 9*((num-1)/9);
		
	}

}
