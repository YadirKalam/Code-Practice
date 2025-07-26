package streamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageOfNum {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5);
//		long length = number.stream().count();
//        System.out.println(length);
//       Optional<Integer> avg= number.stream().reduce((a,b) -> a+b);
//       System.out.println(avg.get());
//      Optional<Object> a =  avg.map(n-> n/ length);
//        System.out.println(a.get());
		
		//or//
		
	double a = number.stream().mapToInt(n->n).average().getAsDouble();
		System.out.println(a);
	}

}
