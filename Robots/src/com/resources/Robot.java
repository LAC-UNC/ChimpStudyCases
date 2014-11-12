package com.resources;

import com.utils.ConcurrencyValidator;
import com.utils.Giver;
import com.utils.Receiver;
import com.utils.WorkSimulator;

public class Robot {
	//Resource stuff
	private String name;
	
	//Simulators
	private WorkSimulator ws;
	
	//Concurrency controller and logger
	private ConcurrencyValidator log;
	
	public Robot(String name) {
		this.name = name;
		this.ws = new WorkSimulator(1000, 400);
		this.log = new ConcurrencyValidator(1,0,this.name);
	}	
	
	protected void move(Giver g, Receiver r, String msg) throws InterruptedException {
		String item = g.giveMeSomeItem();
		this.log.start("moving item " + item + " " + msg);
		this.ws.work();
		this.log.end("item " + item + " moved " + msg);
		r.receiveMeSomeItem(item);
	}
}
