package projects;

public class PrimeNumber {

	public static void main(String[] args) {
		int i = 25;
		boolean flag = false;
		for (int j = 2; j < i / 2; j++) {
			if (i % j != 0) {

				flag = true;
				System.out.println("Given number is a Prime Number");
				break;

			} else {
				System.out.println("Given number is not a Prime Number");
			}

		}

	}

}
