package codeLearn;

import java.util.Arrays;

public class ReverseSecondWordString {

	public static void main(String[] args) {
		String str = "This is my Java Interview";
		String [] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		arr[2]= new StringBuilder(arr[2]).reverse().toString();
		System.out.println(arr[2]);
		String result = String.join(" ", arr);
		System.out.println(result);
	}
    
	
}
