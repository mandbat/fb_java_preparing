package test;

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
