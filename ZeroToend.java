package codeLearn;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// int [] arr = {0,5,9,0,0,10,0,20,30};
 
public class ZeroToend {
	
	public static void main(String[] args) {
		int [] arr = {0,5,9,0,0,10,0,20,30};
		   List<Integer> list = Arrays.stream(arr)  // Convert int[] to IntStream
                   .boxed()        // Convert int to Integer
                   .collect(Collectors.toList());
		   pushZeroByStream(list);
		   
		pushZero(arr);
		System.out.println(Arrays.toString(arr));
		}
	
	
	public static void pushZero(int[] arr) {

	
		int nonZeroIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[nonZeroIndex];
				arr[nonZeroIndex]= arr[i];
				arr[i]= temp;
				nonZeroIndex++;
				
			}
		}
	}

	
	public static void pushZeroByStream(List<Integer>list) {
		 
List<Integer> a=Stream.concat(list.stream().filter(n->n!=0), list.stream().filter(n->n==0)).collect(Collectors.toList());
	System.out.println("using stream"+":"+a);
	}

}
