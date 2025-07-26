package codeLearn;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonrepeatChar {

	public static void main(String[] args) {
		String tempStr = "arohitrohir";
		
	Character a=tempStr.chars().mapToObj(c-> (char) c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.max(Map.Entry.comparingByValue()).map(e->e.getKey()).get();
	   System.out.println(a);
	
		

	}

}
