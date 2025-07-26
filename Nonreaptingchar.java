package codeLearn;

public class Nonreaptingchar {

	public static void  main(String[] args) {
		String s = "geeksforgeeks";
		 int n = s.length();
		 
		 for (int i=0;i<n;i++) {
			 for (int j =i+1;j<n;j++) {
				 if(s.charAt(i)!=s.charAt(j)) {
					 j++;
					 System.out.println(s.charAt(i));
				 }else
					 System.out.println(-1);
			 }
		 }
		
		 
		
		
	}

}
