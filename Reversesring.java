package codeLearn;

public class Reversesring {

	public static void main(String[] args) {
		String word = "yadir", reverse="";
		int i ;
	
		for (i=0;i<word.length();i++) {
			char temp =word.charAt(i);
			reverse=temp+reverse;
		}
		System.out.println(reverse);

	}

}
