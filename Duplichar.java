package codeLearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.IntStream;
public class Duplichar {

	public static void main(String[] args) {
		char[] array = {'a','b','a','c'};
		HashSet<Character> set= new HashSet<Character>();
		 for(char c: array) {
			 set.add(c);
		 }
		
		
		
		 System.out.println(set);
	}
}