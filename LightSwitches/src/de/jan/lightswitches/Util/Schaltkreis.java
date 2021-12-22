package de.jan.lightswitches.Util;

import java.util.ArrayList;

import de.jan.lightswitches.Interfaces.ISchaltbar;

public class Schaltkreis implements ISchaltbar {

	private ArrayList<ISchaltbar> schalter;

	public Schaltkreis() {
		schalter = new ArrayList<ISchaltbar>();
	}

	public void addSchaltbar(ISchaltbar schalter) {
		this.schalter.add(schalter);
	}

	@Override
	public void anSchalten() {
		schalter.forEach(x -> x.anSchalten());
		
	}

	@Override
	public void ausSchalten() {
		schalter.forEach(x -> x.ausSchalten());
	}
}