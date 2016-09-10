package test;

/*
 * We are playing the Guess Game. The game is as follows:
 * I pick a number from 1 to n. You have to guess which number I picked.
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 * -1 : My number is lower
 * 1 : My number is higher
 * 0 : Congrats! You got it!
 * Example:
 * n = 10, I pick 6.
 * Return 6.
 */

public class App_374 {

	public static void main(String[] args) {
		System.out.println(findAnswer(999));
	}

	private static int findAnswer(int n) {

		int min = 1;
		int max = n;

		if (guess(max) == 0)
			return max;
		if (guess(min) == 0)
			return min;

		int mid1 = 1;
		int mid2 = n;

		while (true) {

			if (mid1 == min + (max - min) / 3) {
				mid1++;
			} else {
				mid1 = min + (max - min) / 3;
			}

			if (mid2 == max - (max - min) / 3) {
				mid2--;
			} else {
				mid2 = max - (max - min) / 3;
			}

			int res1 = guess(mid1);
			int res2 = guess(mid2);

			if (res1 == 0)
				return mid1;
			if (res2 == 0)
				return mid2;

			if (res1 == -1) {
				max = mid1;
			} else if (res2 == 1) {
				min = mid2;
			} else {
				min = mid1;
				max = mid2;
			}
		}
	}

	private static int guess(int num) {
		int numToResolve = 7;
		if (num == numToResolve)
			return 0;
		return (numToResolve > num) ? 1 : -1;
	}

}
