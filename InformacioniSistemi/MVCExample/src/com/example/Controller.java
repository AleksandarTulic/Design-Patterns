package com.example;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	private View view;
	private Model model;
	
	public Controller(View view) {
		this.view = view;
		this.model = new Model(view);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setValue();
		view.disabelButton();
	}

}
