package projects;

public class sumOfDigitsFromAString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;

		for (int i = 0; i < text.length(); i++) {
			char[] ch = text.toCharArray();
			System.out.println(ch[i]);

			if (Character.isDigit(ch[i])) {

				int num = Character.getNumericValue(ch[i]);
				sum = num + sum;

				System.out.println("sum: " + sum);

			}
		}
	}
}
