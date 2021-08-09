package collections;

import java.util.LinkedHashSet;

public class listFive {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };

		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>();
		{

			for (int i = 0; i < arr.length; i++) {
				result.add(arr[i]);
				System.out.println(result);

			}
			if (result.contains(arr)) {
				System.out.println(arr);
				
				
			}

		}
	}

}
