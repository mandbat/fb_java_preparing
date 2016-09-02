package test;

public class App_374 {

	public static void main(String[] args) {
		System.out.println(findAnswer(10));
	}

	private static int findAnswer(int n) {

		int min = 1;
		int max = n;

		if (guess(max) == 0)
			return max;
		if (guess(min) == 0)
			return min;

		while (true) {
			int mid = ((max + min) / 2);
			int res = guess(mid);
			if (res == 0) {
				return mid;
			} else if (res == 1) {
				min = mid;
			} else {
				max = mid;
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
