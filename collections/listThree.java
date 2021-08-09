package collections;

import java.util.ArrayList;
import java.util.Collections;

public class listThree {

	public static void main(String[] args) {
		
ArrayList<String> data = new ArrayList<String>();
data.add("Hari");
data.add("Vidya");
data.add("Naveen");
data.add("Sheriba");

System.out.println(data);

Collections.sort(data);	
for (String result : data) {
	System.out.println(result);
	
}

	}

}
