package streamCoding;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter thr number");
		int number = input.nextInt();
		int a =0; int b = 1;     // 0 1 1 2 3 5 8 13 
		 System.out.println(a);
		 System.out.println(b);
		for(int i=2;i<number-1; i++) {
		 int  next = a+b;
		

		 System.out.println(next);
		  a=b;
		  b=next;
		}
		
	}

}
