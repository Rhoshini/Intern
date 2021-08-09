package projects;

import java.util.Iterator;

import org.openqa.selenium.devtools.dom.model.CharacterDataModified;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
String test ="changeme";
char odtu[] = test.toCharArray();
for (int i = 0; i < odtu.length; i++) {
	
	if (i%2 !=0) {
		System.out.println(Character.toUpperCase(odtu[i]));
		
	}
	else {
		System.out.println(odtu[i]);
	}
	
}


	}

}
