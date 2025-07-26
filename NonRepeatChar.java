package streamCoding;

import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatChar {

	public static void main(String[] args) {
		String str = "papaya";

	Character a=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(e->e.getKey())
		.findFirst().orElse(null);
	System.out.println(a);
				
	}

}
