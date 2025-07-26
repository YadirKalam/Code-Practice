package codeLearn;
/**Reverse vowels of String : 

    Input: s = "hello" Output: "holle"

    Input: s = "leetcode" Output: "leotcede*/
 
public class Vowelreverse {

	public static void main(String[] args) {
		String str = "leetcode";
		System.out.println(reverseVow(str));

	}
static boolean vowelPresent(char c) {
	return(c=='a'||c=='e' ||c=='i' ||c=='o'|| c=='u');
}
	
	static String reverseVow(String str1) {
		int j=0;
		char[] str = str1.toCharArray();
		String vowel ="";
		for(int i =0;i<str.length;i++) {
			if(vowelPresent(str[i])) {
				j++;
				vowel += str[i];
			}
		}
		 for (int i=0;i<str.length;i++) {
			 if(vowelPresent(str[i])) {
				 str[i]= vowel.charAt(--j);
			 }
		 }
		 return String.valueOf(str);
	}
}
