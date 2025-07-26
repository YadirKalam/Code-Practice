package codeLearn;
import java.util.Arrays;

public class Thirdlargestno {

	public static void main(String[] args) {
    int[]arr = {7,3,9,6,1,8,2,4,5,0};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++) {
    System.out.println(arr[i]);
	}
    System.out.println("3rd largest no is" + arr[arr.length-3]);
	}
}
