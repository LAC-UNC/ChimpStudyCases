package resources;

import com.lac.annotations.Resource;

import utils.Addeable;
import utils.Item;
import utils.MessagesHelpers;

@Resource
public class PB implements Addeable {

	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Piston piston = null;
	
	private Piston p;
	
	public PB(){
		if(PB.piston == null) {
			PB.piston = new Piston("PB", new PC(), 150, 30, 12, 5);
			MessagesHelpers.infoMessage("The PB piston has been created.");
		}
		
		this.p = PB.piston;
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
