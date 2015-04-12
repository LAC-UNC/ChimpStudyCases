package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import resources.PlainPiston;
import utils.FinalContainer;

import com.lac.petrinet.configuration.providers.PNMLConfigurationReader;
import com.lac.petrinet.core.PetriNet;
import com.lac.petrinet.exceptions.PetriNetException;
import com.productioncell.dummies.v2.AbiertoPistonDummy;
import com.productioncell.dummies.v2.AdelantePistonDummy;
import com.productioncell.dummies.v2.AdelantePistonPrimeroDummy;
import com.productioncell.dummies.v2.AtrasPistonDummy;
import com.productioncell.dummies.v2.ErrorChecker;
import com.productioncell.dummies.v2.ErrorHandlerPistonDummy;

public class ProductionCellChimpV2Main {
	public static void main(String[] args) throws PetriNetException {
		
		// Resources
		FinalContainer finalContainer = new FinalContainer();
		PlainPiston a = new PlainPiston("PA", 200, 20, 15, 10);
		PlainPiston b = new PlainPiston("PB",  150, 30, 12, 5);
		PlainPiston c = new PlainPiston("PC", 170, 40, 8, 4);
		PlainPiston d = new PlainPiston("PD", 120, 80, 14, 10);
		
		// Dummies Adelante
		AdelantePistonPrimeroDummy adelanteA = new AdelantePistonPrimeroDummy("t2", a );
		AdelantePistonDummy adelanteB = new AdelantePistonDummy("t21", b);
		AdelantePistonDummy adelanteC = new AdelantePistonDummy("t28", c);
		AdelantePistonDummy adelanteD = new AdelantePistonDummy("t37", d);
		
		// Dummies Atras
		AtrasPistonDummy atrasA = new AtrasPistonDummy("t3", a, b );
		AtrasPistonDummy atrasB = new AtrasPistonDummy("t18", b, c );
		AtrasPistonDummy atrasC = new AtrasPistonDummy("t26", c, d );
		AtrasPistonDummy atrasD = new AtrasPistonDummy("t35", d, finalContainer );
		
		// Dummies Abierto
		AbiertoPistonDummy abiertoA = new AbiertoPistonDummy("t4", a);
		AbiertoPistonDummy abiertoB = new AbiertoPistonDummy("t17", b);
		AbiertoPistonDummy abiertoC = new AbiertoPistonDummy("t25", c);
		AbiertoPistonDummy abiertoD = new AbiertoPistonDummy("t34", d);
		
		// Dummies Error checker
		ErrorChecker errorCheckerA = new ErrorChecker("t11", a);
		ErrorChecker errorCheckerB = new ErrorChecker("t15", b);
		ErrorChecker errorCheckerC = new ErrorChecker("t31", c);
		ErrorChecker errorCheckerD = new ErrorChecker("t40", d);
		
		// Dummies Error Handler
		ErrorHandlerPistonDummy errorHandlerA = new ErrorHandlerPistonDummy("t5", a);
		ErrorHandlerPistonDummy errorHandlerB = new ErrorHandlerPistonDummy("t10", b);
		ErrorHandlerPistonDummy errorHandlerC = new ErrorHandlerPistonDummy("t9", c);
		ErrorHandlerPistonDummy errorHandlerD = new ErrorHandlerPistonDummy("t7", d);
		
		// Relacionar dummies y transiciones Informadas.
		PNMLConfigurationReader pnmlConfigurator = new PNMLConfigurationReader();
		PetriNet pn = pnmlConfigurator.loadConfiguration(ProductionCellChimpV2Main.class.getClassLoader()
				.getResource("resources/modelov2.2.pnml").getPath());
		pn.assignDummy("t1", adelanteA);
		pn.assignDummy("t16", adelanteB);
		pn.assignDummy("t24", adelanteC);
		pn.assignDummy("t33", adelanteD);
		
		pn.assignDummy("t2", abiertoA);
		pn.assignDummy("t21", abiertoB);
		pn.assignDummy("t28", abiertoC);
		pn.assignDummy("t37", abiertoD);
		
		pn.assignDummy("t4", atrasA);
		pn.assignDummy("t17", atrasB);
		pn.assignDummy("t25", atrasC);
		pn.assignDummy("t34", atrasD);
		
		pn.assignDummy("t8", errorCheckerA );
		pn.assignDummy("t13", errorCheckerB );
		pn.assignDummy("t30", errorCheckerC );
		pn.assignDummy("t39", errorCheckerD );
		
		pn.assignDummy("t41", errorHandlerA);
		pn.assignDummy("t14", errorHandlerB);
		pn.assignDummy("t23", errorHandlerC);
		pn.assignDummy("t32", errorHandlerD);
		
		List<String> groupOne = new ArrayList<String>();
		List<String> groupTwo = new ArrayList<String>();
		List<String> groupThree = new ArrayList<String>();
		List<String> groupFour = new ArrayList<String>();
		
		groupOne.add("t8");
		groupOne.add("t1");

		groupTwo.add("t13");
		groupTwo.add("t4");
		groupTwo.add("t16");
		
		groupThree.add("t30");
		groupThree.add("t17");
		groupThree.add("t24");
		
		groupFour.add("t39");
		groupFour.add("t25");
		groupFour.add("t33");
		
		
		pn.addTransitionNameGroup(groupOne);
		pn.addTransitionNameGroup(groupTwo);
		pn.addTransitionNameGroup(groupThree);
		pn.addTransitionNameGroup(groupFour);
		
		HashMap<String, String> inputEvents = new HashMap<String, String>();
		inputEvents.put("PA-error-found", "t22");
		inputEvents.put("PB-error-found", "t42");
		inputEvents.put("PC-error-found", "t44");
		inputEvents.put("PD-error-found", "t46");
		
		pn.setInputEventsMap(inputEvents);
		
		pn.startListening();
	}
	
	
}
