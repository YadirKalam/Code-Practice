package test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCoding {

	public static void main(String[] args) {

		String str= "yadirkalam";
	Map<Character, Long>	map =str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	}

}
