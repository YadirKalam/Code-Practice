package codeLearn;
/** Maximum no. of vowels in any substring of given length k in the given string s.
   Input: s = "abciiidef", k = 3 output: 3
   Input: s = "leetcode", k = 3 output: 2
   Input: s = "weallloveyou", k = 7 Output: 4*/
public class MaxVowels {

	public static void main(String[] args) {
		
          String str ="weallloveyou";
          System.out.println(maxVowels(str));
	}
	
	public static int maxVowels(String s) {
		String vowels="aeiou";
		int max=0;
		int current=0;
		for(char c: s.toCharArray()) {
			if(vowels.indexOf(c) !=-1) {
				current++;
			}
		}
		return current;
	}

}
