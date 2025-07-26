package test;
/**
 * 2,33,22,44,1,7
 * @author home
 *
 */
public class NextInteger {

	public static void main(String[] args) {
		
	int [] arr = {2,33,22,44,1,7};
	int given  =5;
	Integer next =findNextValue(arr,given);
	
    System.out.println("next number"+next);

}
	 public static Integer findNextValue(int []arr,int num) {
		 Integer next = null;
		 for(int val:arr) {
			 if(val>num) {
				 if(next==null || val<next) {
					 next= val;
				 }
			 }
		 }
		 return next;
	 }
}
