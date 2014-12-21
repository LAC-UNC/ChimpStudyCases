package utils;

import java.util.Random;

public class ProbabilisticSensor {

	private int range = 100000;
	private double baseProb;
	private Random rand = new Random();
	WorkSimulator measuringSimulator;
	
	public ProbabilisticSensor(double prob) {
		this.baseProb = prob;
		this.measuringSimulator = new WorkSimulator(500, 400);
	}

	public boolean read() throws InterruptedException{
		measuringSimulator.work();
		return this.rand.nextInt(range) <= (int)(this.baseProb * range);
	}
}
