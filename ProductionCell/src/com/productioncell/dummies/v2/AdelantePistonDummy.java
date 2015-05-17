package com.productioncell.dummies.v2;

import resources.Piston;
import utils.Addeable;
import utils.Geteable;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AdelantePistonDummy extends Dummy {

	Piston piston;
	Geteable origen;
	Addeable destino;
	
	public AdelantePistonDummy(String tName, Piston piston, Geteable origen, Addeable destino) {
		super(tName);
		this.piston = piston;
		this.origen = origen;
		this.destino = destino;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			piston.addItem(origen.getItem());
			piston.moveForward();
			destino.addItem(piston.returnItem());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
