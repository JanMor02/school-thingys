package de.jan.lightswitches.Util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import de.jan.lightswitches.Interfaces.ISchaltbar;

public class Motor extends JFrame implements ISchaltbar {
	private boolean istAn = false;

	private static int positionY = 200;

	public Motor() {
		super();
		this.setTitle("Motor");
		this.setLocation(800, positionY);
		positionY += 250;
		this.setLayout(new FlowLayout());
		this.setMinimumSize(new Dimension(200, 200));
		this.motorAus();
		this.pack();
		this.toFront();
		this.setVisible(true);
	}

	public void motorAus() {
		this.getContentPane().setBackground(Color.black);
	}

	public void motorAn() {
		this.getContentPane().setBackground(Color.blue);
	}

	@Override
	public void anSchalten() {
		motorAn();
	}

	@Override
	public void ausSchalten() {
		motorAus();
	}
}