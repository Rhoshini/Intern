package projects;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
		int t1length = text1.length();
		int t2length = text2.length();
		char[] ch = text1.toCharArray();
		char[] cha = text2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(cha);
		
	if (text1.length() == text2.length()) {
		if (Arrays.equals(ch, cha)) {
			System.out.println("Anagram");
		}
			else 
			{
			System.out.println("not an Anagram");
			}
	
		}
		}
		
	}