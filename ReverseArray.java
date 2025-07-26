package streamCoding;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int [] array = {1,2,3,4};
		int [] rev = new int [array.length];

		for (int j = 0; j < array.length; j++) {
			
				rev[(array.length-1)-j] = array[j];
				
			
			
		}
		 System.out.println(Arrays.toString(rev));
	}

}
