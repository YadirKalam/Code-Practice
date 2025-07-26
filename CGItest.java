package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CGItest {

	public static void main(String[] args) {

        List<String> list =Arrays.asList("apple", "mango", "banana","apple","mango","kiwi");
      Map<String, Long> map =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        
        System.out.println(map);
    

	}

}
