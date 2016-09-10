package test;

/*
 * Ransom Note  
 * 
 *  Given  an  arbitrary  ransom  note  string  and  another  string  containing  letters from  all  the  magazines,  
 * write  a  function  that  will  return  true  if  the  ransom   note  can  be  constructed  from  the  magazines;
 *  otherwise,  it  will  return  false.   
 * Each  letter  in  the  magazine  string  can  only  be  used  once  in  your  ransom  note.
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */

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
