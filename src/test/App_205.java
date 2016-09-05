package test;

import java.util.HashMap;

public class App_205 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("aba", "gdg"));
	}

	private static boolean isIsomorphic(String s, String t) {

		// Map<Character, ArrayList<Integer>> hash1 = new HashMap<>();
		// Map<Character, ArrayList<Integer>> hash2 = new HashMap<>();
		//
		// for (int i = 0; i < s.length(); i++) {
		// ArrayList<Integer> value = hash1.get(s.charAt(i));
		// if (value == null) {
		// hash1.put(s.charAt(i), new ArrayList<>(Arrays.asList(i)));
		// } else
		// value.add(i);
		// }
		//
		// for (int i = 0; i < t.length(); i++) {
		// for (Entry<Character, ArrayList<Integer>> entry : hash1.entrySet()) {
		// if (entry.getValue().contains(i)) {
		// ArrayList<Integer> list = entry.getValue();
		// hash2.put(t.charAt(i), list);
		// }
		// }
		// }
		//
		// char[] chRes = t.toCharArray();
		// for (Entry<Character, ArrayList<Integer>> entry : hash2.entrySet()) {
		// Character key = entry.getKey();
		// for (Integer i : entry.getValue()) {
		// chRes[i] = key;
		// }
		// }
		//
		// System.out.println(s);
		// System.out.println(t);
		// System.out.println(String.valueOf(chRes));
		//
		// return t.equals(String.valueOf(chRes));

		HashMap<Character, Character> map = new HashMap<Character, Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);

			if (map.containsKey(ch1)) {
				if (map.get(ch1) != ch2)
					return false;
			} else {
				if (map.containsValue(ch2))
					return false;
				map.put(ch1, ch2);
			}
		}

		return true;
	}
}
