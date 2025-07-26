package codeLearn;
import java.util.*;


public class PrimeNo{
	public static void main (String[] arg) {
		int i;
		System.out.println("Enter a Number");
		 Scanner scn = new Scanner(System.in);
		 int n= scn.nextInt();
		 
		 int count=0;
		 for (i=1;i<=n; i++) {
			 
			 if(n%i==0) {
				 
				 
				 count++;
			 }
			 
			 
		 } 
		 if (count==2) {
			 System.out.println(n+ " "+ " is prime");
		 }
		 else {
			 System.out.println(n+ " "+ " is Non-prime");
		 }
	}
}