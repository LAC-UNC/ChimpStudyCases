package com.productioncell.dummies.v2;

import resources.Piston;
import utils.MessagesHelpers;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class ErrorChecker extends Dummy {

	Piston piston;
	String errorEvent;
	
	public ErrorChecker(String tName, Piston piston, String errorEvent) {
		super(tName);
		this.piston = piston;
		this.errorEvent = errorEvent;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			MessagesHelpers.infoMessage(piston.generatePistonMsg("Starting error checking."));
			while(true) {
				if(piston.errorChecker()) {
					MessagesHelpers.warningMessage(piston.generatePistonMsg("End of road reached. It could lead to an error."));
					trigger(this.errorEvent);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

	
}
