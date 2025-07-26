package codeLearn;

public class MaxProductOFSubArray {

	public static void main(String[] args) {
		int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum Product Subarray: " + maxProduct(arr));

	}

	public static int maxProduct(int []arr) {
		int pro =1;
		int max_pro= arr[0];
		for(int i=0;i<arr.length;i++) {
			pro = pro * arr[i];
			
			if(pro>max_pro) {
				max_pro= pro;
			}
			if(pro<0) {
				pro=1;
			}
		}
		return max_pro;
	}
}
