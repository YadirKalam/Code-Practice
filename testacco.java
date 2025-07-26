package codeLearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/** 1,2,3,4,5,2,3,4,7,8 */
public class testacco {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,2,3,4,7,8);
	
	int 	a= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream().filter(entry->entry.getValue()>1).mapToInt(e->e.getKey()).sum();
	
	System.out.println(a);

	}

}
