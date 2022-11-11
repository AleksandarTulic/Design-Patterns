package com.example.interfaces;

import java.util.*;

public interface IPresentationModel {
	public String getFrameTitle();
	public void setFrameTitle(String frameTitle);
	public String getLabelText();
	public void setLabelText(String labelText);
	public int getSelectedIndex();
	public void setSelectedIndex(int selectedIndex);
	public List<String> getElements();
}
