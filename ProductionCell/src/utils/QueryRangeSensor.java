package utils;

import java.util.Random;

public class QueryRangeSensor {
	//Sensor simulator
	private Random rand = new Random();
	private int randMax;
	private int randMin;
	private int queryCount;
	private int queriesToComplete;
	
	public QueryRangeSensor(int max, int min) {
		this.randMax = max;
		this.randMin = min;
	}
	
	public void startCapturing() {
		this.queryCount = 0;
		this.queriesToComplete = this.rand.nextInt((this.randMax - this.randMin) + 1) + this.randMin;
	}
	
	public boolean read(){
		return ++this.queryCount == this.queriesToComplete;
	}
}
