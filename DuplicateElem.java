package streamCoding;
import java.util.*;
public class DuplicateElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
     list.stream().filter(s->!set.add(s)).forEach(s->System.out.println(s));
      
	}

}
