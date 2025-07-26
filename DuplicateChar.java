package streamCoding;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateChar {

	public static void main(String[] args) {
	String s = "abcadefc";
	
	List<Character>a = s.chars().mapToObj(c->(char)c).collect(Collectors.toList());
	
	System.out.println(a);
	List<Character> t= a.stream().filter(n-> Collections.frequency(a, n)>1).distinct().collect(Collectors.toList());
	System.out.println(t);
	}}


