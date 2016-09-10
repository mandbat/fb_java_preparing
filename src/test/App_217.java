package test;

/*
 * Contains Duplicate  
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */

import java.util.HashSet;

public class App_217 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 5 };
		System.out.println(containsDuplicate(a));
	}

	public static boolean containsDuplicate(int[] nums) {

		if (nums == null || nums.length == 0)
			return false;

//		HashSet<Integer> set = new HashSet<Integer>();
//		for (int i : nums) {
//			if (!set.add(i)) {
//				return true;
//			}
//		}
//
//		return false;

		HashSet<Integer> set = new HashSet<>();
		for (int i : nums) {
			set.add(i);
		}
		if (nums.length == set.size()) return false; else return true;
		
	}

}
