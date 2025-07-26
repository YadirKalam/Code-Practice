package codeLearn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortHashMap {

	public static void main(String[] args) {
		  Map <String, Integer> shopping = new HashMap<>();
		  shopping.put("clothes", 120);
		  shopping.put("grocery", 150);
		  shopping.put("transport", 100);
		  shopping.put("misc", 90);
		  
		Stream<Map.Entry<String, Integer>> a = shopping.entrySet().stream().sorted(Map.Entry.comparingByKey());
	//	a.sorted(Map.Entry.comparingByValue()).collect(null)
		System.out.println(Arrays.toString(a.toArray()));
		
	}

}
