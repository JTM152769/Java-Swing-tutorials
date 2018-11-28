package com.amit.swingTutorial2;

import javax.swing.SwingUtilities;

public class App {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(() -> {
			
			new MainFrame();
		});
	}

}
