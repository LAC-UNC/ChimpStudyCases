package resources;

import com.lac.annotations.Resource;

import utils.Addeable;
import utils.Item;
import utils.MessagesHelpers;

@Resource
public class PC implements Addeable {

	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Piston piston = null;
	
	private Piston p;
	
	public PC(){
		if(PC.piston == null) {
			PC.piston = new Piston("PC", new PD(), 170, 40, 8, 4);
			MessagesHelpers.infoMessage("The PC piston has been created.");
		}
		
		this.p = PC.piston;
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
