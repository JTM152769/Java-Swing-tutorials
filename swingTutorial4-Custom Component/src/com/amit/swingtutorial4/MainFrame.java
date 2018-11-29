package com.amit.swingtutorial4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	private JButton btn;
	private TextPanel textPanel;
	
	public MainFrame() {
		super("My World App");
		
		setLayout(new BorderLayout());
		
		btn = new JButton("Click me");
		textPanel = new TextPanel();
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPanel.appendText("This action is actionPerformed on Click\n");
			}
		});
		
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}