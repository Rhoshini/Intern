package collections;

import java.util.HashSet;

public class setData {

	public static void main(String[] args) {
		HashSet<Integer> nos = new HashSet<Integer>();
		nos.add(7);
		nos.add(9);
		nos.add(4);

		for (int i = 0; i <= 10; i++) {
			if (nos.contains(i)) {
				System.out.println("Data found in set" + i);

			} else {
				System.out.println("Data not found in set" + i);
			}

		}

	}

}
