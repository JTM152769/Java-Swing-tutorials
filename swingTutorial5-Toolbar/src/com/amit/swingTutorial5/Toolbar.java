package com.amit.swingTutorial5;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel {
	private JButton home;
	private JButton view;
	
	public Toolbar() {
		 home = new JButton("Home");
		 view = new JButton("View");
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(home);
		add(view);
	}
}