package resources;

import utils.Addeable;
import utils.MessagesHelpers;

public class ChainedPiston extends Piston {
	Addeable next; //It could be another piston or maybe the final container
	
	public ChainedPiston(String name, Addeable next, int moveCycleMaxTime, int moveCycleMinTime, int maxQueriesToPositionate, int minQueriesToPositionate) {
		super(name, moveCycleMaxTime, moveCycleMinTime, maxQueriesToPositionate, minQueriesToPositionate);
		this.next = next;
	}
	
	public void moveBackward() throws Exception {
		if(this.next == null){
			throw new Exception(generatePistonMsg("No next element to assign Item."));
		}
		MessagesHelpers.infoMessage(generatePistonMsg("The item " + this.itemHandled.getItemName() + " is not longer in this piston domain."));
		passItemToNext();
		MessagesHelpers.infoMessage(generatePistonMsg("Moving backward."));
		this.beginOfRoad.startCapturing();
		while(!this.beginOfRoad.read()) {
			this.moveACycleSimulator.work();
		}
		MessagesHelpers.infoMessage(generatePistonMsg("Moving backward ended. The piston is in home position."));
	}
	
	private void passItemToNext() {
		this.next.addItem(this.itemHandled);
		this.itemHandled = null;
	}
}
