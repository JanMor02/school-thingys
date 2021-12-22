package de.jan.lightswitches;

import de.jan.lightswitches.Interfaces.ISchaltbar;
import de.jan.lightswitches.Util.Lampe;
import de.jan.lightswitches.Util.Motor;
import de.jan.lightswitches.Util.Schalter;
import de.jan.lightswitches.Util.Schaltkreis;

public abstract class Main implements ISchaltbar {

	public static void main(String[] args) {
		
		Lampe l1= new Lampe();
		Motor m1 = new Motor();
		
		Schaltkreis sk1 = new Schaltkreis();
		
		Schalter s1 = new Schalter();

		sk1.addSchaltbar(l1);
		sk1.addSchaltbar(m1);
		
		
	}
}
