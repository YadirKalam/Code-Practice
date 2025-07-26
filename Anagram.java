package codeLearn;
import java.util.Arrays;

/** Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.
 
Example 1:
 
Input: s = "anagram", t = "nagaram"
 
Output: true
 
Input: s = "rat", t = "car"
 
Output: false
has context menu */
public class Anagram {

	public static void main(String[] args) {
		String s1 = "rat";
		String s2 = "car";
		System.out.println(isAnagram(s1,s2));

	}
	
	static boolean isAnagram(String s1, String s2) {
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		
		return Arrays.equals(s1Array, s2Array);
	}

}
