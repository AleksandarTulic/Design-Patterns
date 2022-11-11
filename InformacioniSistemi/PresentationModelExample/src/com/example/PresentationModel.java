package com.example;

import java.util.List;

import com.example.interfaces.*;

public class PresentationModel implements IPresentationModel {
	private String frameTitle;
	private String labelText;
	private int selectedIndex;
	private IModel model;
	
	public PresentationModel() {
		this.model = new Model();
	}

	public String getFrameTitle() {
		return frameTitle;
	}

	public void setFrameTitle(String frameTitle) {
		this.frameTitle = frameTitle;
	}

	public String getLabelText() {
		return labelText;
	}

	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}

	@Override
	public List<String> getElements() {
		return model.getElements();
	}
}
