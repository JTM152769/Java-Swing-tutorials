package com.amit.swingTutorial5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	private JButton button;
	private TextPanel textPanel;
	private Toolbar toolbar;
	
	public MainFrame() {
		
		super("My World App");
		
		setLayout(new BorderLayout());
		
		toolbar = new Toolbar();
		
		button = new JButton("Click Me");
		
		textPanel = new TextPanel();
		
		button.addActionListener( e -> {
			
			textPanel.appendText("This action is actionPerformed on Click\n");
			
		});
		
		add(toolbar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}
}
