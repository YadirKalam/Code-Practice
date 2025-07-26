package test;

import java.util.Arrays;
import java.util.List;

/**
 * i/p: {"hi", "hello", "welcome", "bye"}
o/p: {2,5, 7, 3}
 
 * @author home
 *
 */
public class StringLength {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "welcome", "bye");
	
       for(String word : words) {
    	   System.out.println(getLenght(word));
       }
}
	public static int getLenght(String str) {
		int count =0;
		for(char c: str.toCharArray()) {
			count++;
		}
		return count;
	}
	
}
