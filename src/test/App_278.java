package test;

/*
 * First Bad Version
 * 
 * You are a product manager and currently leading a team to develop a new product. 
 * Unfortunately, the latest version of your product fails the quality check. 
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which will return whether version is bad. 
 * Implement a function to find the first bad version. 
 * You should minimize the number of calls to the API.
 */

public class App_278 {

	static int firstBad = 300;
	static int lenght = 1000;
	static int i = 1;
	static int j = 1;

	public static void main(String[] args) {
		System.out.println(reverseVowels(lenght));
		System.out.println("my:   " + i);
		System.out.println(reverseVowels2(lenght));
		System.out.println("site: " + j);
	}

	public static int reverseVowels2(int n) {

		int left = 1;
		int right = n;
		while (left < right) {
			int mid = left + (right - left) / 2;
			j++;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
		}
		return left;
	}

	private static int reverseVowels(int n) {

		int min = 1;
		int max = n;

		i++;
		if (isBadVersion(min))
			return min;

		int mid1 = min;
		int mid2 = max;

		while (true) {

			if (mid1 == min + (max - min) / 3)
				mid1++;
			else
				mid1 = min + (max - min) / 3;

			if (mid2 == max - (max - min) / 3) {
				if (mid1 + 1 != mid2)
					mid2--;
			} else
				mid2 = max - (max - min) / 3;

			i++;
			boolean res1 = isBadVersion(mid1);
			i++;
			boolean res2 = isBadVersion(mid2);

			if (res1 == false && res2 == true && mid2 == mid1 + 1)
				return mid2;

			if (res2 == false)
				min = mid2;
			else if (res1 == false && res2 == true) {
				min = mid1;
				max = mid2;
			} else if (res1 == true)
				max = mid1;

		}

	}

	private static boolean isBadVersion(int m) {
		if (m >= firstBad)
			return true;
		return false;
	}

}
