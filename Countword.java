package codeLearn;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countword {
    public static void main(String[] args) {
    	
    	String word = "I am a doctor of a doctor";

    	String temp []= word.split(" ");
//    int count = 0;
//    	
//    	for(int i=0; i <= temp.length;i++) {
//    		for (int j=i+1; j<temp.length;j++) {
//    			if(temp[i].equalsIgnoreCase(temp[j])) {
//    			System.out.println(temp[j]);
//    			 count ++;
//     			System.out.println(count);
//
//    			}
//    		}
//    	}
    	
    	System.out.println(Arrays.toString(temp));
  List<String> map=  Arrays.stream(temp).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    		.entrySet().stream().filter(n->n.getValue()==2).map(e->e.getKey()).collect(Collectors.toList());
  
   System.out.println(map);
    }
    }