package streamCoding;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FirstRepeatingEle {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,2,2,3,5,1);
		Set<Integer> set = new HashSet<>();
		int b =0;
	int a = list.stream().filter(n-> !set.add(n)).findFirst().get();
		
		System.out.println(a);
		 

	}

}
