package codeLearn;
import java.util.*;
public class PrimeNo1{
    public static void main(String[]arg){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number");
        int n= input.nextInt();
      int  count=0;
      
     for(int i = 1;i<=n;i++) {
    	if( n%i==0){
    		count++;
    	}
    	 
     }
        if (count==2){
            System.out.println("prime");
        }
        else{
 System.out.println("non-prime");
        }
    }
}