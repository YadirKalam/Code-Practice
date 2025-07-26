package codeLearn;
import java.util.*;
public class primeBtwn {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        System.out.println("Enter a Number");
        int m = sc.nextInt();
      
        int i;
        int div;
        int count = 0;
        for(i=n;i<=m;i++) {
        	for(div=1;div<=i;div++) {
        		
        		if(i%div==0) {
        			count++;
        		}
        	}
        	if (count==2) {
   			 System.out.println(i+ " "+ " is prime");
   		 }
   		 else {
   			 System.out.println(i+ " "+ " is Non-prime");
   		 }
        }
	}

}
