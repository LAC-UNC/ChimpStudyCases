package com.utils;

public class ConcurrencyValidator {
	
	private int cantMax;
	private int cantMin;
	private int count;
	private String name;
	
	public ConcurrencyValidator(int maxThreads, int minThreads, String name) {
		this.cantMax = maxThreads;
		this.cantMin = minThreads;
		this.name = name;
		this.count = 0;
	}

	public void start(String msg) {
		this.count++;
		if(this.count <= this.cantMax) {
			System.out.println(">>>>>> " + this.name + ": " + msg);
		} else {
			System.out.println(">>>>>> " + this.name + ": ---- ERROR ---- count above bounds. count(" + this.cantMax + ") = " + this.count);
		}
	}

	public void end(String msg) {
		this.count--;
		if(this.count >= this.cantMin) {
			System.out.println("<<<<<< " + this.name + ": " + msg);
		} else {
			System.out.println("<<<<<< " + this.name + ": ---- ERROR ---- count below bounds. count(" + this.cantMin + ") = " + this.count);
		}
	}
}
