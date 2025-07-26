package streamCoding;
import java.util.*;
public class NumbersStartingWith1 {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		myList.stream().map(String::valueOf).filter(n->n.startsWith("1")).forEach(n-> System.out.println(n));

	}

}
