package streamCoding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

	public static void main(String[] args) {
    List <Integer> list = Arrays.asList(1,3,10,5,7,9);
    int [] array = {1,3,10,5,7,9};
    int a =  list.stream()
    		.distinct()
    		.sorted(Collections.reverseOrder())
    		.skip(1)
    		.findFirst()
    		.get();
    System.out.println(a);
 
    
    
    
    
    int s=   Arrays.stream(array).boxed().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
 System.out.println("Output from Stream"+" " +s);
	}

}
