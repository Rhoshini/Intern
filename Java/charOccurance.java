package projects;

public class charOccurance {

	public static void main(String[] args) {
		String str ="Welcome to chennai";
		int count=0;
		char[] ch = str.toCharArray();
		str.length();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]=='e') {
				count=count+1;
				
			}
		}
		System.out.println(count);
		
	}

}
