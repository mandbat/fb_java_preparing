package test;

public class App_258 {

	public static void main(String[] args) {
		int n = 123411233;
		System.out.println(addDigits(n));
	}

	private static int addDigits(int num) {

//		while (num > 9) {
//
//			char[] ch = ("" + num).toCharArray();
//			int k = 0;
//			for (char c : ch) {
//				k = k + Integer.valueOf(String.valueOf(c));
//			}
//			num = k;
//
//		}
//		return num;

		return num - 9*((num-1)/9);
		
	}

}
