package com.example;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View implements Contract.View{
	private JFrame frame;
	private JButton b1;
	private JLabel l1;
	
	private Contract.Presenter presenter;

	public static void main(String[] args) {
		View window = new View();
		window.frame.setVisible(true);
	}

	public View() {
		this.presenter = new Presenter(this);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		b1 = new JButton("SET VALUE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				presenter.onButtonClick();
			}
		});
		b1.setBounds(10, 32, 123, 23);
		frame.getContentPane().add(b1);
		
		l1 = new JLabel("");
		l1.setBounds(187, 32, 140, 23);
		frame.getContentPane().add(l1);
	}

	public void setLabel(String value) {
		this.l1.setText(value);
	}
	
	public void setDisabled() {
		this.b1.setEnabled(false);
	}
}
