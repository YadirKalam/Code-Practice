package codeLearn;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int n =4;
        int k = n % arr.length;
        System.out.println(Arrays.toString(rotate(arr,k)));

	}
	public static int [] rotate(int []num,int k) {
		
		 reverse(num,0,num.length-1);
		 reverse(num,0,k-1);
		 reverse(num,k,num.length-1);
		 return num;
	}

	public static void reverse(int[] arr, int start, int end) {
		
		while(start<=end) {
		int temp = arr[start];
		arr[start]= arr[end];
		arr[end]= temp;
		start++;
		end--;
		}
	}
}
