package streamCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {

	public static void main(String[] args) {
		/** duplicate element  */
//		List<Integer> list = Arrays.asList(1,2,3,2,5);
//		Set<Integer> set = new HashSet<Integer>();
//		int dup =0;
//		for(int abc :list) {
//			if (set.contains(abc))
//				 dup = abc;
//			else {
//				set.add(abc);
//			}
//			
//		}
//	System.out.println(set);
//	System.out.println(dup);
		
		Map<Integer, String> map = new HashMap<>();		
		map.put(1,"Yadir");
		map.put(2,"Kalam");
		map.put(3, "Saurav");
		
		Set<String> set = new TreeSet<String>();
		
		for(String abc :map.values()) {
			set.add(abc);
			
		}
		System.out.println(set);
	}

}
