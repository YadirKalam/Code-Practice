package streamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumofNum {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(1,2,3);
		Optional<Integer> sum =number.stream().reduce(Integer::sum);
		System.out.println(sum.get());
	}

}
