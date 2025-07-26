package codeLearn;
import java.util.ArrayList;
import java.util.List;

// input= 123456789
// output = 135792468
public class SortOddEven {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
		 List<Integer> oddList = new ArrayList<>();
	        List<Integer> evenList = new ArrayList<>();
	        String abc= "Yadir";
	        String a = new String("Yadir");
	        String bc = new String ("Yadir").intern();
	        System.out.println(abc==bc);
//		for (int i = 0; i <= arr.length-1; i++) {
//        if(arr[i]%2!=0) {
//        	oddList.add(arr[i]);
//        }else {
//        	evenList.add(arr[i]);
//        }
//		}
//       
//     oddList.addAll(evenList);
//     System.out.println(oddList);
//	}

}
}
