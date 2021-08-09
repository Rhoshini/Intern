package projects;

public class Sample {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
				//print is used to keep the loop in the same line
			}
			System.out.println();
		}
	}
}