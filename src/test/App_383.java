package test;

public class App_383 {

	public static void main(String[] args) {
		System.out.println(canConstruct("aa", "a1ab"));
	}

	private static boolean canConstruct(String s1, String s2) {
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		for (char c : ch1) {
			int i = new String(ch2).indexOf(c);
			if (i == -1) {
				return false;
			} else {
				ch2[i] = '0';
			}
		}
		return true;
	}

}
