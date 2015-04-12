package com.productioncell.dummies.v2;

import resources.Piston;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AdelantePistonDummy extends Dummy {

	Piston piston;
	
	public AdelantePistonDummy(String tName, Piston piston) {
		super(tName);
		this.piston = piston;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			piston.moveForward();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
