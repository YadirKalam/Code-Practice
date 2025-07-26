package codeLearn;
/** Input = "aabbbcc"
Output = "a2b3c2" */
public class TestCount {

	public static void main(String[] args) {
		String str = "aabbbcc";
		String output = countChar(str);
		System.out.println(output);
		
	}

	public static String countChar(String str) {
		StringBuilder strB = new  StringBuilder();
		int count =1;
		for(int i=0;i<str.length();i++) {
			if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
			} else {
				strB.append(str.charAt(i)).append(count);
				count= 1;
			}
		}
		return strB.toString();
	}
}
