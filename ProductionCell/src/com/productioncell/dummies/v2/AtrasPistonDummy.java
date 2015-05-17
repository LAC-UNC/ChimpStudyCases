package com.productioncell.dummies.v2;

import resources.Piston;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AtrasPistonDummy extends Dummy {

	Piston piston;
	
	public AtrasPistonDummy(String tName, Piston piston) {
		super(tName);
		this.piston = piston;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			piston.moveBackward();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
