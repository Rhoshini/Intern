package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class setRemoveDuplicates {

	public static void main(String[] args) {
		int array[] = { 1, 3, 3, 3, 3, 5, 6, 6, 7, 7, 7 };

		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
		for (int i = 0; i < array.length; i++) {
			result.add(array[i]);

		}
		System.out.println(result);

	}

}
