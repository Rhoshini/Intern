package collections;

import java.util.ArrayList;

public class listOne {

	public static void main(String[] args) {
		
ArrayList<String> data = new ArrayList<String>();
data.add("Java");
data.add("Python");
data.add("Ruby");
data.add("JavaScript");
data.add("R");

System.out.println(data);

data.remove("Python");
data.remove("R");
System.out.println(data);

	}

}
