package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Twosum {

	public static void main(String[] args) {

		List<Integer> list= Arrays.asList(2,7,11,15,10);
		int target = 22;
		List<Integer> result =findSum(list, target);
		if(!result.isEmpty()) {
			System.out.println(result.get(0)+","+ result.get(1));
		}else {
		System.out.println("no solution");
		}
	}

	public static List<Integer> findSum(List<Integer> list,int target){
		Map<Integer,Integer> map = new HashMap<>(); 
		for(int i=0;i<list.size();i++) {
			int complement = target- list.get(i);
			if(map.containsKey(complement)) {
				return Arrays.asList(map.get(complement),i);
			}
			map.put(list.get(i), i);
		}
		return Collections.emptyList();
	}
}
