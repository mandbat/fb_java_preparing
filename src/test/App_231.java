package test;

/*
 * Power of Two
 * 
 * Given an integer, write a function to determine if it is a power of two.
 */

public class App_231 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(6));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;

		while (n > 2) {
			int t = n >> 1;
			int c = t << 1;

			if (n != c)
				return false;

			n = n >> 1;
		}
		return true;
	}
}
