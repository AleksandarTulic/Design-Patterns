package com.example;

import java.util.*;

import com.example.interfaces.IModel;

public class Model implements IModel{
	private List<String> arr = new ArrayList<>();
	
	public Model() {
		for (int i=0;i<10;i++) {
			arr.add("Element " + i);
		}
	}
	
	public List<String> getElements(){
		return arr;
	}
}
