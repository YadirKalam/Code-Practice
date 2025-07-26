package test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StartingFrom {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(2001,3321,2243,2544,2455);
		List<Integer> list =numbers.stream().filter(n->String.valueOf(n).startsWith("2")).collect(Collectors.toList());
		System.out.println(list);
		
		Map<Object, Object> map =numbers.stream().collect(Collectors.toMap(n->n, n->String.valueOf(n).chars().filter(c->c=='2').count()));
		
		System.out.println(map);
	}

}
