package test;

/*
 * Power of Three
 * 
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */

public class App_326 {

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(27));
	}

	public static boolean isPowerOfThree(int n) {
		if (n == 1)
			return true;
		while (n > 0) {
			int m = n % 3;
			if (m == 0) {
				n = n / 3;
				if (n == 1)
					return true;
			} else {
				return false;
			}
		}
		return false;
	}
}
