package resources;

import utils.Item;
import utils.ItemGenerator;
import utils.MessagesHelpers;

import com.lac.annotations.Resource;

@Resource
public class PA {

	//We perform a ""kind"" of a singleton in order to obtain only one shared instance of this resource
	// We have differents instance with the same piston and same p instances among all the intances.
	private static Piston piston = null;
	private ItemGenerator ig = new ItemGenerator();
	
	private Piston p;
	
	public PA(){
		if(PA.piston == null) {
			PA.piston = new Piston("PA", new PB(), 200, 20, 15, 10);
			MessagesHelpers.infoMessage("The PA piston has been created.");
		}
		
		this.p = PA.piston;
	}
	
	public void moveForward() throws InterruptedException {
		this.p.addItem(ig.generateItem());
		this.p.moveForward();
	}

	public void moveBackward() throws Exception {
		this.p.moveBackward();
	}
	
	public void waitInPosition() throws InterruptedException {
		this.p.waitInPosition();
	}
	
	public void errorChecker() throws InterruptedException {
		this.p.errorChecker();
	}
	
	public void errorHandler() {
		this.p.errorHandler();
	}
	
	public void debug1() {
		System.out.println("Debug1");
	}
	
	public void debug2() {
		System.out.println("Debug2");
	}
}
