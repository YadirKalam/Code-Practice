package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 *Coding:- 
find common elements between 3 array list 
{1,2,3,5,6,11}
{3,4,5}
{1,5,7,9,11,14,16,19}
ans-> {1,3,5,11}
 *
 */
public class CommonElement {

	public static void main(String[] args) {
		 
		List<List<Integer>> lists =Arrays.asList(Arrays.asList(1,2,3,5,6,11),
				Arrays.asList(3,4,5),Arrays.asList(1,5,7,9,11,14,16,19));
		
		List<Integer> common= findCommon(lists);
		System.out.println(common);
		

	}
	public static List<Integer> findCommon(List<List<Integer>> lists){
		Map<Integer, Long> frequency = lists.stream().flatMap(List::stream)
				.collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		return frequency.entrySet().stream()
				.filter(entry->entry.getValue()>=2)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());
	}
	
	public static List<Integer> frequency(int[]arr1,int[]arr2,int[]arr3){
		Map<Integer, Integer> frequency= new HashMap<>();
		List<Integer> result= new ArrayList<>();
		for(int num:arr1) {
			frequency.put(num, 1);
		}
		for(int num:arr2) {
			frequency.put(num, frequency.getOrDefault(num,0)+1);
		}
		for(int num: arr3) {
			frequency.put(num, frequency.getOrDefault(num,0)+1);

		}
		for(Map.Entry<Integer,Integer> entry:frequency.entrySet()) {
			int count = entry.getValue();
			if(count>=2) {
				result.add(entry.getKey());
			}
		}
		return result;
	}

}
