package com.example;

public class Presenter implements Contract.Presenter{
	private Contract.Model model;
	private Contract.View view;

	public Presenter(Contract.View view) {
		this.model = new Model();
		this.view = view;
	}

	public void onButtonClick() {
		if (model != null) {
			view.setLabel(model.getRandomString());
			view.setDisabled();
		}
	}
}
