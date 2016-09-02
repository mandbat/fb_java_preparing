package test;

public class App_387 {

	public static void main(String[] args) {
		System.out.println(reverseVowels("dddccdbba"));
	}

	private static int reverseVowels(String s) {

		char[] ch = s.toCharArray();

		int i = 0;
		for (char c : ch) {
			if (c == '0') {
				i++;
				continue;
			}
			boolean pr = true;
			int j = i + 1;
			while (j < ch.length) {
				if (c == ch[j]) {
					pr = false;
					ch[j] = '0';
				}
				j++;
			}
			if (pr)
				return i;
			else
				ch[i] = '0';
			i++;
		}
		return -1;
	}

}