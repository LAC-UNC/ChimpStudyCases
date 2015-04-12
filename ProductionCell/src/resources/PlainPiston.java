package resources;

public class PlainPiston extends Piston {
	boolean checkingStarted = false;
	
	public PlainPiston(String name, int moveCycleMaxTime, int moveCycleMinTime, int maxQueriesToPositionate, int minQueriesToPositionate) {
		super(name, moveCycleMaxTime, moveCycleMinTime, maxQueriesToPositionate, minQueriesToPositionate);
	}

	public boolean errorChecker() throws InterruptedException {
		return this.endOfRoad.read();
	}
}
