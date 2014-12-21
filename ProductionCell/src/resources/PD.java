package resources;

import com.lac.annotations.Resource;

import utils.Addeable;
import utils.FinalContainer;
import utils.Item;
import utils.MessagesHelpers;

@Resource
public class PD implements Addeable {

	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Piston piston = null;
	
	private Piston p;
	
	public PD(){
		if(PD.piston == null) {
			PD.piston = new Piston("PD", new FinalContainer(), 120, 80, 14, 10);
			MessagesHelpers.infoMessage("The PD piston has been created.");
		}
		
		this.p = PD.piston;
	}
	
	public void moveForward() throws InterruptedException {
		this.p.moveForward();
	}
	
	public void moveBackward() throws InterruptedException {
		this.p.moveBackward();
	}
	
	public void waitInPosition() throws InterruptedException {
		this.p.waitInPosition();
	}
	
	public void errorChecker() throws InterruptedException {
		this.p.errorChecker();
	}
	
	@Override
	public void addItem(Item item) {
		this.p.addItem(item);
	}

}
