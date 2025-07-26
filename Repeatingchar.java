package codeLearn;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Repeatingchar {

	public static void main(String[] args) {
		String s = "aabbcadddef";
		int i = 0;
		Set<Character> repeat = new HashSet<Character>();
		for (i = 0; i < s.length(); ++i) {
			for (int j = 0; j < s.length(); ++j) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					repeat.add(s.charAt(j));
				}

			}

		}
		System.out.println(repeat);
	}
}