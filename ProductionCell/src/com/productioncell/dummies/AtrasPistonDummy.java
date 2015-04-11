package com.productioncell.dummies;

import resources.Piston;
import utils.Addeable;
import utils.Item;

import com.lac.petrinet.components.Dummy;
import com.lac.petrinet.exceptions.PetriNetException;

public class AtrasPistonDummy extends Dummy {

	Piston origen;
	Addeable destino;
	
	public AtrasPistonDummy(String tName, Piston pistonOrigen,  Addeable pistonDestino ) {
		super(tName);
		this.origen = pistonOrigen;
		this.destino = pistonDestino;
	}

	@Override
	protected void execute() throws PetriNetException {
		try {
			Item item = origen.returnItem();
			destino.addItem(item);
			origen.moveBackward();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
