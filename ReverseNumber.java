package codeLearn;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 124;
		int temp=0;
		int rev =0;
		while(!(num==0)) {
			 temp = num% 10; //4 2
		
			rev = rev*10+temp; //4 +2
			num=num/10;
		}
		System.out.println(rev);
	}

}
