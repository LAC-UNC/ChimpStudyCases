package com.productioncell.dummies.v1;

import resources.Piston;
import utils.ItemGenerator;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AdelantePistonPrimeroDummy extends Dummy {

	Piston piston;
	private ItemGenerator ig = new ItemGenerator();
	
	public AdelantePistonPrimeroDummy(String tName, Piston piston) {
		super(tName);
		this.piston = piston;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			this.piston.addItem(ig.generateItem());
			this.piston.moveForward();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
