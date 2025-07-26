package codeLearn;

public class ArrayMinMax {

	public static void main(String[] args) {
		int [] array = {50,25,60,10};

		int max = array[0];
		for (int i=0;i<array.length;i++) {
			
			if (array[i]>max) {
				max= array[i];
			}
		}
		System.out.println(max);
	}

}
