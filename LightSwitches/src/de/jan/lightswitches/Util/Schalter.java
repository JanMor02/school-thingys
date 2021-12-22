package de.jan.lightswitches.Util;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import de.jan.lightswitches.Interfaces.ISchaltbar;

public class Schalter extends JFrame implements ActionListener, ISchaltbar {
	
	final JButton anSchalter;
	final JButton ausSchalter;

	private Lampe lampe = null;
	private Motor motor = null;

	private static int positionY = 200;

	public Schalter() {
		super();

		this.setTitle("Schalter");
		this.setLocation(400, positionY);
		positionY += 100;
		this.setLayout(new FlowLayout());
		anSchalter = new JButton("An");
		anSchalter.addActionListener(this);
		this.add(anSchalter);
		ausSchalter = new JButton("Aus");
		ausSchalter.addActionListener(this);
		ausSchalter.setEnabled(false);
		this.add(ausSchalter);
		this.pack();
		this.toFront();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		final JButton button = (JButton) arg0.getSource();
		if (button == anSchalter) {
			anSchalten();
		} else {
			ausSchalten();
		}
	}

	public void setLampe(Lampe lampe) {
		this.lampe = lampe;
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void ausSchalten() {
		anSchalter.setEnabled(true);
		ausSchalter.setEnabled(false);
		if (lampe != null)
			lampe.ausSchalten();
		if (motor != null)
			motor.anSchalten();
			
	}

	public void anSchalten() {
		anSchalter.setEnabled(false);
		ausSchalter.setEnabled(true);
		if (lampe != null) 
			lampe.anSchalten();
		if (motor != null)
			motor.anSchalten();
	}
}
