package streamCoding;

public class HighestValue {

	public static void main(String[] args) {
		
		int [] abc = {1,2,3,4,5};
		
		int max = abc[0];
		for (int i =0;i<abc.length;i++) {
			if(abc[i]>max) {
				max=abc[i];
			}
		}
		System.out.println(max);
	}
 
}
