/*
 * @(#)CorreccionBonoloto.java 1.0 08/01/26
 *
 * You can modify the template of this file in the
 * directory ..\JCreator\Templates\Template_1\Project_Name.java
 *
 * You can also create your own project template by making a new
 * folder in the directory ..\JCreator\Template\. Use the other
 * templates as examples.
 *
 */
package myprojects.correccionbonoloto;

import java.awt.*;
import java.awt.event.*;

class CorreccionBonoloto extends Frame {
	
	public CorreccionBonoloto() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		System.out.println("Starting CorreccionBonoloto...");
		CorreccionBonoloto mainFrame = new CorreccionBonoloto();
		mainFrame.setSize(400, 400);
		mainFrame.setTitle("CorreccionBonoloto");
		mainFrame.setVisible(true);
	}
}
