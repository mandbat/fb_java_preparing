package test;

/*
 * Number of 1 Bits
 * 
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */

public class App_191 {

	public static void main(String[] args) {
		App_191 app = new App_191();
		int k = 2147483647;
		System.out.println(app.hammingWeight(k));
	}

	public int hammingWeight(int n) {
		int count = 0;
		for (int i = 1; i < 33; i++) {
			if ((n & (1 << i)) != 0) {
				count++;
			}
		}
		return count;
	}
}
