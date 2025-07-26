package codeLearn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/** findSingleElement 
[4, 1, 2, 1, 2, 3, 5, 3]
 
 */
public class SingleElement {

	public static void main(String[] args) {
		int arr[] = {4,1, 2, 1, 2, 3, 5, 3};// multiple element
		int arr1[] = {1, 2, 1, 2, 3, 5, 3}; //single element 
		System.out.println("from XOR approach"+" "+single(arr1));
		
		int n= arr.length;
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
	}
		List<Integer> list = new ArrayList<>();
		for(int num: map.keySet()) {
			if(map.get(num)==1)
			list.add(num);
		}
		System.out.println("normal approach "+" "+list);
	}
	// XOR method for single element occur
	public static int single(int [] arr) {
		int result =0;
		for(int i =0; i<arr.length;i++) {
			result = result^arr[i];
		}
		return result;
	}
}
