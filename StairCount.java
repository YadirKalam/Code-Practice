package codeLearn;

public class StairCount {

	public static void main(String[] args) {
		int n =4;
		System.out.println(countWays(n));

	}
	
	public static int countWays(int n) {
		if(n==0)
			return 1;
		if(n<1)
			return 0;
		return countWays(n-1) + countWays(n-2) +countWays(n-3);
	}

}
