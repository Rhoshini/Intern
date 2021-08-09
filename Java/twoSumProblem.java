package projects;

import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {

	static void sum(int nums[], int target) {
		System.out.println("Method 1 using arrays");
		// 2, 11, 15, 7, 3 
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("[" + i + "," + j + "]");
					System.out.println(" num1:"+ nums[i]);
					System.out.println(" num2:"+ nums[j]);
				}
			}
		}
	}

	public void findSumUsingMap(int num[], int X) {
		System.out.println("Method 2 using Hash Map");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			map.put(num[i],i);
		}
		
		
		for (int i = 0; i < num.length; i++) {
			int value = X - num[i];
			
		//	map.containsValue(7)
			
			
			if (map.containsKey(X - num[i])) {
				System.out.println(num[i] + "," + (X - num[i]));
				
			}
			
		//	map.get(key)
			
		}
		// X 9
		// 0 2
		// 1 11
		// 2 15
		// 3 7
		// 4 3
	}

	public static void main(String[] args) {
		//sum(int nums[], int target) 
		 
		sum(new int[] { 2, 11, 15, 7, 3 }, 9);
		
		
		
		twoSumProblem obj = new twoSumProblem();
		obj.findSumUsingMap(new int[] { 2, 11, 15, 7, 3 }, 9);
	}
}
