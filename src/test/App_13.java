package test;

/*
 * Roman to Integer  
 * 
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * I - 1
 * V - 5
 * X - 10
 * L - 50
 * C - 100
 * D - 500
 * M - 1000
 */

public class App_13 {

	public static void main(String[] args) {
		App_13 app = new App_13();
		System.out.println(app.romanToInt("XIX"));
	}

	public int romanToInt(String s) {

		char[] ch = s.toCharArray();
		int i = 0;
		int summ = 0;
		while (i < ch.length) {

			int n1;
			int n2;
			n1 = getInt(ch[i]);
			if (i + 1 < ch.length)
				n2 = getInt(ch[i + 1]);
			else
				n2 = 0;
			if (n1 >= n2) {
				summ = summ + n1;
			} else {
				summ = summ - n1;
			}
			i++;
		}

		return summ;

	}

	public static int getInt(char c) {

		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

}
