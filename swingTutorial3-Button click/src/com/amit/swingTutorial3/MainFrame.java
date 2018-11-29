package com.amit.swingTutorial3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {
	
	private JButton btn;
	private JTextArea textArea;
	
	public MainFrame() {
		super("My World App");
		
		setLayout(new BorderLayout());
		
		btn = new JButton("Click me");
		textArea = new JTextArea();
		
		// Use of Lambda expression as ActionListener is Functional Interface
		btn.addActionListener(arg0 -> {
			
				textArea.append("This action is actionPerformed on Click\n");
			
		});
		
		add(textArea, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(700, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}