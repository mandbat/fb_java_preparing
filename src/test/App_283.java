package test;

import java.util.Arrays;

public class App_283 {

	public static void main(String[] args) {
		// int[] mass = { 0, 1, 0, 0, 5, 0, 3, 12, 0, 0, 0, 77 };
		int[] mass = { 0, 0, 0, 0 };
		System.out.println(Arrays.toString(moveZeroes(mass)));
	}

	public static int[] moveZeroes(int[] nums) {

		int countZirro = 0;
		int currentPosition = 0;
		int currentScan = 0;

		while (countZirro + currentPosition < nums.length) {
			while (currentScan < nums.length && nums[currentScan] == 0) {
				currentScan++;
				countZirro++;
			}
			if (currentScan < nums.length) {
				nums[currentPosition] = nums[currentScan];
				currentPosition++;
				currentScan++;
			}
		}
		while (currentPosition < nums.length) {
			nums[currentPosition] = 0;
			currentPosition++;
		}

		return nums;
	}

}
