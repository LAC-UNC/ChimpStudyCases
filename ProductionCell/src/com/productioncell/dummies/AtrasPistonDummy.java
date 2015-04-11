package com.productioncell.dummies;

import resources.Piston;
import utils.Addeable;
import utils.Item;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AtrasPistonDummy extends Dummy {

	Piston pistonOrigen;
	Addeable pistonDestino;
	
	public AtrasPistonDummy(String tName, Piston pistonOrigen,  Addeable pistonDestino ) {
		super(tName);
		this.pistonOrigen = pistonOrigen;
		this.pistonDestino = pistonDestino;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			Item item = pistonOrigen.returnItem();
			pistonDestino.addItem(item);
			pistonOrigen.moveBackwardWithoutItem();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
