package streamCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionArray {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 10, 20, 40, 80};
		int[] arr2 = {6, 7, 20, 80, 100};
		int[] arr3 = {3, 4, 15, 20, 30, 70, 120};
		// stream approach
		List<Integer> twoArray = Arrays.stream(arr1).filter(n -> Arrays.stream(arr2).anyMatch(s -> s == n)).boxed()
				.collect(Collectors.toList());
		System.out.println("two array intersection"+ " "+twoArray);
		
		List<Integer> threeArray = 	Arrays.stream(arr1).filter(n -> Arrays.stream(arr2).anyMatch(s -> s == n)).filter(n->Arrays.stream(arr3).anyMatch(s -> s == n)).boxed()
		.collect(Collectors.toList());
        System.out.println("three array intersection"+ " "+threeArray);
		

		
		// normal approach -----------------------------------
//		Set<Integer> set1 = new HashSet<>();
//		Set<Integer> set2 = new HashSet<>();
//		for(int num:arr1) {
//			set1.add(num);
//		}
//		for(int num: arr2) {
//			if(set1.contains(num)) {
//				set2.add(num);
//			}
//		}
//		System.out.println(set2);
	}
	

}
