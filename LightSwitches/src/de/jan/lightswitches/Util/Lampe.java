package de.jan.lightswitches.Util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import de.jan.lightswitches.Interfaces.ISchaltbar;

public class Lampe extends JFrame implements ISchaltbar {

	private boolean istAn = false;

	private static int positionY = 200;

	public Lampe() {
		super();
		this.setTitle("Glühbirne");
		this.setLocation(600, positionY);
		positionY += 250;
		this.setLayout(new FlowLayout());
		this.setMinimumSize(new Dimension(200, 200));
		ausSchalten();
		this.pack();
		this.toFront();
		this.setVisible(true);
	}

	public void ausSchalten() {
		this.getContentPane().setBackground(Color.black);
	}

	public void anSchalten() {
		this.getContentPane().setBackground(Color.yellow);
	}
}