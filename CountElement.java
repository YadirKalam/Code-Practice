package streamCoding;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**How to count each element/word from the String ArrayList in Java8? 
Input : ("AA", "BB", "AA", "CC")
Output :{CC=1, BB=1, AA=2}*/
 
public class CountElement {

	public static void main(String[] args) {
		List<String> input = Arrays.asList("AA", "BB", "AA", "CC");
	Map<String, Long> map =	input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(map);

	}

}
