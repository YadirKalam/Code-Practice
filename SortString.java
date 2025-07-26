package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * String[] str = {“eat”, “tan”,”nat”, ”tea”};
		O/P – {[“eat”, ”tea”], [“tan”, “nat”]};
 *
 */
public class SortString {

	public static void main(String[] args) {

		String[] str = { "eat", "tan", "nat", "tea" };

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				char[] first = str[i].toCharArray();
				char[] next = str[j].toCharArray();

				Arrays.sort(first);
				Arrays.sort(next);
				String newStr1 = new String(first);
				String newStr2 = new String(next);
				if (newStr1.equals(newStr2)) {
					List<String> list = new ArrayList<>();
					list.add(str[i]);
					list.add(str[j]);
					System.out.println(list);
				}
			}
		}

	}

}
