package projects;

public class armstrongNumber {

	public static void main(String[] args) {
			int i=153;
			int  value=i;
			int r=0, result=0;
			
			
			while (i>0) {
				r=i%10;
				result= result+(r*r*r);
				i=i/10;
					
			}
			System.out.println(i);
			System.out.println("Sum of the digit: "+result);
			
			
			if (value==result) {
				System.out.println("The given number is an armstrong number");
				
			} else {
				System.out.println("The given number is not an armstrong number");

			}
	}
}
			
			
			
			
		

