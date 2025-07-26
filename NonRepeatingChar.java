package codeLearn;

public class NonRepeatingChar {

	public static void main(String[] args) {
	String str ="yadiryashd";
    System.out.println(repeatingChar(str));
	}

	public static char repeatingChar(String str) {
		int n = str.length();
		
		for(int i=0; i<n;i++) {
			boolean found = false;
			
			for(int j =0;j<n;j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					found = true;
				}
			}
			if(found==false) {
				return str.charAt(i);
			}
			
		}
		return '$';
	}
}
