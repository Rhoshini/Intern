package projects;

public class SumOfDigits {

	public static void main(String[] args) {
		int i=153;
		int r=0, result=0;
		
		while (i>0) {
			r=i%10;
			result= result+r;
			i=i/10;
				
		}
		System.out.println("Sum of the digit: "+result);	
		
		
		
		
		
		
	}

}
