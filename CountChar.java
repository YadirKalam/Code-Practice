package codeLearn;

import java.util.*;

public class CountChar {

	public static void main(String[] args) {
		String str ="my name is yadir";
	
		char []ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<>();
		for(char c : ch) {
			int count =1;
			if(c!=' ') {
				if(map.containsValue(1)) {                                                                                                                                  
					count++;
				}
				map.put(c, count);
			}
		}
		System.out.println(map);
	}

}
