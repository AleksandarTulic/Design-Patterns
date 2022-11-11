package com.example;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import com.example.interfaces.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;

public class View {

	private JFrame frame;
	private IPresentationModel presentationModel;
	private JLabel l1;
	private JComboBox cb1;
	private JButton b1;
	
	public static void main(String[] args) {
		View window = new View();
		window.frame.setVisible(true);
	}

	public View() {
		initialize();
	}

	private void initialize() {
		this.presentationModel = new PresentationModel();
		
		frame = new JFrame();
		frame.setTitle("Tit");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		cb1 = new JComboBox();
		cb1.setBounds(35, 33, 134, 29);
		frame.getContentPane().add(cb1);
		
		cb1.addActionListener (new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				presentationModel.setSelectedIndex(cb1.getSelectedIndex());
				loadFromPresentationModel();
			}
		});
		
		l1 = new JLabel("");
		l1.setBounds(202, 33, 134, 29);
		frame.getContentPane().add(l1);
		
		b1 = new JButton("SAVE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveToPresentationModel();
				loadFromPresentationModel();
			}
		});
		b1.setBounds(35, 94, 134, 35);
		frame.getContentPane().add(b1);
		
		loadFromPresentationModel();
	}
	
	private void saveToPresentationModel() {
		String item = (String)cb1.getSelectedItem();
		presentationModel.setFrameTitle(item);
		presentationModel.setLabelText(item);
		presentationModel.setSelectedIndex(cb1.getSelectedIndex());
	}
	
	private void loadFromPresentationModel() {
		List<String> arr = presentationModel.getElements();
		cb1.removeAllItems();
		for (String i : arr) {
			cb1.addItem(i);
		}
		
		frame.setTitle(presentationModel.getFrameTitle());
		l1.setText(presentationModel.getLabelText());
		cb1.setSelectedIndex(presentationModel.getSelectedIndex());
	}
}
