package test;

public class App_171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("AB"));
	}

	public static int titleToNumber(String s) {

		int summ = 0;
		int t = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			summ = summ + (int) Math.pow(26, t) * (s.charAt(i) - 'A' + 1);
			t++;
		}

		return summ;
	}

}
