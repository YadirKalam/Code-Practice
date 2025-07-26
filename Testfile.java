package test;

import java.util.Arrays;
import java.util.Scanner;

public class Testfile {

	public static void main(String[] args) {
		int [] arr= {1,1,1,0,0,1};
	 puchZero(arr);
	 for(int num: arr) {
		 System.out.println(num);
	 }
      
	}

	public static void puchZero(int [] arr) {
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]= arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
}
