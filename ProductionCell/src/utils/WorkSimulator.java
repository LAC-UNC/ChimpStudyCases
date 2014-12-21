package utils;

import java.util.Random;

public class WorkSimulator {

	//Work simulator
	private Random rand = new Random();
	private int randMax;
	private int randMin;
	
	public WorkSimulator(int max, int min) {
		this.randMax = max;
		this.randMin = min;
	}
	
	public void work() throws InterruptedException {
		Thread.sleep(this.rand.nextInt((this.randMax - this.randMin) + 1) + this.randMin);
	}
}
