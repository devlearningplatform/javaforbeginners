package org.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DataStrcutures {
	public static void main(String param[]) {
		int[] numbersArray = new int[5];
		numbersArray[0] = 0;
		numbersArray[1] = 1;
		numbersArray[2] = 2;
		numbersArray[3] = 3;
		numbersArray[4] = 4;
		
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(0);
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(3);
		
		numberList.remove(3);
		
		Set<Integer> numberSet = new HashSet<>();
		numberSet.add(0);
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		numberSet.add(4);
		
		Map<Integer, String> numbersMap = new HashMap<>();
		numbersMap.put(1, "Student001");
		numbersMap.put(2, "Student002");
		
		System.out.println("Array[0] = " + numbersArray[0]);
		System.out.println("List(0) = " + numberList.get(0));
		
		Integer[] setValues = numberSet.toArray(new Integer[numberSet.size()]);
		System.out.println("Set(0) = " + setValues[0]);
		
		
		System.out.println("Map key 1 = " + numbersMap.get(1));		
	}
}
