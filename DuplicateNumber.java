package streamCoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,2,10,15,3,10,1);
		List<Integer> dup = num.stream().filter(n -> Collections.frequency(num, n) > 1).distinct()
				.collect(Collectors.toList());
		
		System.out.println(dup);
	}

}
