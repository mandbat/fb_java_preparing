package test;

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
