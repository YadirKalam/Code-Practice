package test;

import java.util.Arrays;

public class TestCapg {

	public static void main(String[] args) {
	int arr []= {20,10,5,4,100};
	int  i;
	int max =arr[0];
	for(i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);

	int a=Arrays.stream(arr).filter(n->n % 2==0)
	.sum();
	System.out.println(a);
	}

}
