package com.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class View {

	private JFrame frame;
	private Controller controller;
	private JButton b1;
	private JLabel l1;
	public static void main(String[] args) {
					View window = new View();
					window.frame.setVisible(true);
	}

	public View() {
		controller = new Controller(this);
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		b1 = new JButton("SET VALUE");
		b1.addActionListener(controller);
		b1.setBounds(10, 32, 89, 23);
		frame.getContentPane().add(b1);
		
		l1 = new JLabel("");
		l1.setBounds(119, 32, 140, 23);
		frame.getContentPane().add(l1);
	}
	
	public void setLabel(String value) {
		this.l1.setText(value);
	}
	
	public void disabelButton() {
		this.b1.setEnabled(false);
	}
}
