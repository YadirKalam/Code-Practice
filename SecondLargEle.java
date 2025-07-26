package codeLearn;

import java.util.Arrays;

public class SecondLargEle {

	public static void main(String[] args) {
		int []arr = {-1,-3,-2,-4,-5,-7,-45,-33,-23,-90};
		System.out.println(secondALargest(arr));
	}
   public static int secondALargest(int[]arr) {
	   int n = arr.length;
	 int largest = Integer.MIN_VALUE; 
	 int secondLargest= Integer.MIN_VALUE;
	 for(int i =0;i<n;i++) {
		 if(arr[i]>largest) {
			 secondLargest= largest;
			 largest= arr[i];
		 } else if(arr[i]<largest && arr[i]>secondLargest) {
			 secondLargest=arr[i];
			 
		 }
	 }
	 return  secondLargest;
   }
}
