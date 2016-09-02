package test;

public class App_389 {

	public static void main(String[] args) {
		System.out.println(reverseVowels(""));
	}

	private static char reverseVowels(String str) {

		String s1 = "abcdef";
		String s2 = "abcdxef";

		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		int i = 0;
		while (i < c2.length) {
			char c = c2[i];
			int j = new String(c1).indexOf(c);
			if (j == -1)
				return c;
			c1[j] = 0;
			i++;
		}
		return "".charAt(0);
	}

}
