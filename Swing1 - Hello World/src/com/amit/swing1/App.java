/*
 * @author :Amit Kumar Sah
 */
package com.amit.swing1;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		//In case of Multithreaded Application
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("Hello World");
				frame.setSize(600, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});	
		
		//alternavitely in lambda expression
		SwingUtilities.invokeLater(() -> {
				JFrame frame = new JFrame("Hello World");
				frame.setSize(600, 500);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
		});	
	}

}
