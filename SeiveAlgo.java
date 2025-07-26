package codeLearn;
import java.util.Arrays;

public class SeiveAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean prime[]= seiveAlgo(20);
    for(int i=0;i<=20;i++) {
    	if(prime[i]==true) {
    	 System.out.println(i +" ");
    	}
    }
	}

	public static boolean[] seiveAlgo(int n) {
		
		boolean prime[]=new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0]=false;
		prime[1]=false;
		
		for ( int i=2;i*i<=n;i++) {
			for(int j=i*i;j<=n;j=j+i) {
				prime[j]=false;
			}
		}
		
		return prime;
		
	}
}
