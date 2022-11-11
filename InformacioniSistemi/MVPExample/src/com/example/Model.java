package com.example;

import java.util.*;

public class Model implements Contract.Model{
	List<String> arr = Arrays.asList("Operation 1", "Operation 2", "Operation 3", "Operation 4", "Operation 5");
	
	public String getRandomString() {
		Random rand = new Random();
		int value = rand.nextInt(arr.size());
		
		return arr.get(value);
	}
}
