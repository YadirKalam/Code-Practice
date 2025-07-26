package streamCoding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumofIntegrOddPos {

	public static void main(String[] args) {
		
		int [] arr = {1,2,5,1,3,1,9,2,5,7};
		System.out.println(sumOfodd(arr));

System.out.println();
	}
  public static int sumOfodd(int [] arr) {
	  return IntStream.range(0, arr.length)
			  .filter(i->i%2==1)
			  .map(i->arr[i])
			  .sum();
			  
  }
}
