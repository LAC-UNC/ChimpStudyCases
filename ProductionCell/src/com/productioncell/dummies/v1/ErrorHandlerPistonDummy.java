package com.productioncell.dummies.v1;

import resources.Piston;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class ErrorHandlerPistonDummy extends Dummy {

	Piston piston;
	
	public ErrorHandlerPistonDummy(String tName, Piston piston) {
		super(tName);
		this.piston = piston;
	}

	@Override
	protected void execute() throws PetriNetException {
		piston.errorHandler();
	}

}
