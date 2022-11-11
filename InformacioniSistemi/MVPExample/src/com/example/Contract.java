package com.example;

public interface Contract {
	interface View{
		public void setLabel(String value);
		public void setDisabled();
	}
	
	interface Model{	
		public String getRandomString();
	}
	
	interface Presenter{
		public void onButtonClick();
	}
}
