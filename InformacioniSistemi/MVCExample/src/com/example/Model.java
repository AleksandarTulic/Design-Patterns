package com.example;

public class Model {
	private View view;
	
	public Model(View view) {
		this.view = view;
	}
	
	public void setValue() {
		view.setLabel("Some Value ...");
	}
}
