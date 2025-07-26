package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDelo {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","word","c","345","@","#","!");
		 List<String> specialChars= list.stream()
	                .filter(s -> s.matches("[#&$@]")) // Matches only non-alphanumeric characters
	                .collect(Collectors.toList());

	        // Print the result
	        System.out.println(specialChars);
	}

}
