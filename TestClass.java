package streamCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
	
		int[] nums = {1,1,2};
	
		Set<Integer> a=removeDuplicates(nums);
		System.out.println(a);
		
	
	}

	public static Set<Integer> removeDuplicates(int[] nums) {
		Set<Integer> set = new LinkedHashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		return set;
	}
}

	

