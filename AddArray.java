package codeLearn;

import java.util.Arrays;

public class AddArray {

	public static void main(String[] args) {
  
		
		int [] abc = {7,8,9,10};
		int [] xyz = {1,2,3,4,5};
		int [] add = new int [abc.length + xyz.length];
		int a = abc.length + xyz.length;
		System.out.println(Arrays.toString(add));
		int i ;
		for (i=0;i< abc.length;i++) {
			add[i]= abc[i];
		}
		for(i=0;i<xyz.length;i++) {
			add[i+abc.length]= xyz[i];
		}
		Arrays.sort(add);
		System.out.println(Arrays.toString(add));
		
	}
		}
	


