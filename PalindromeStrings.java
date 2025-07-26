package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeStrings {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "madam", "canal", "level");
		List<String> palindrome =findPalindrome(words);
		System.out.println("palindrome is "+palindrome);
	}

	public static List<String> findPalindrome(List<String> words){
		List<String> result = new ArrayList<>();
		for(String word:words) {
			if(isPalindrome(word)) {
				result.add(word);
			}
		}
		return result;
	}
	 private static boolean isPalindrome(String str) {
		 int left =0, right=str.length()-1;
		 while(left<right) {
			 if(str.charAt(left)!=str.charAt(right)) {
				 return false;
			 }
			 left++;
			 right--;
		 }
		 return true;
	 }
	
}
