package streamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public   class MinMaxNo {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(5,10,85,100,78,99);
		
		int n = num.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(n);
	}

}
