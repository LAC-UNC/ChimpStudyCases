package com.productioncell.dummies;

import resources.Piston;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AbiertoPistonDummy extends Dummy {

	Piston piston;
	
	public AbiertoPistonDummy(String tName, Piston piston) {
		super(tName);
		this.piston = piston;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			piston.waitInPosition();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
