package streamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a large list of numbers, write a program that uses parallel streams to
 * calculate the sum of the squares of all even numbers. Discuss the potential
 * advantages and pitfalls of using parallel streams. List<Integer> numbers =
 * Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
 * 19, 20);
 * 
 * @author home
 *
 */
public class SumOfSqure {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
              numbers.parallelStream().filter(n->n%2==0).map(n->n*n).sorted().forEach(s->System.out.println(s));
	}

}
