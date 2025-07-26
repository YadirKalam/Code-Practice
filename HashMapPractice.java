package streamCoding;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class HashMapPractice {

	public static void main(String[] args) {
		  ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Banana"); 
	        fruits.add("Guava"); 
	        fruits.add("Pineapple"); 
	        fruits.add("Apple"); 
	        fruits.add("Apple");
	        System.out.println(fruits);
	      //  Map<Integer, String> map = new HashMap<Integer, String>();
	        
	        Map<Object, Integer> map=   fruits.stream()
	        		.collect(Collectors.toMap( n ->n,String :: length,(existing, replacement) -> existing));
	        System.out.println(map);
	        
	      
	}

}
