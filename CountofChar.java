package test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountofChar {

	public static void main(String[] args) {
		String str ="my name is yadir is";
		String a =str.replaceAll(" ", "");
		System.out.println(a);
		
		Map<Character, Long> map =a.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);

	}

}
