package com.resources;

import java.util.ArrayList;

import com.utils.ConcurrencyValidator;
import com.utils.Receiver;
import com.utils.WorkSimulator;

public class Output implements Receiver {

	//Resource stuff
	protected ArrayList<Integer> items; 
	private String name;
	
	//Simulators
	private WorkSimulator ws;
	
	//Concurrency controller and logger
	private ConcurrencyValidator log;
	
	public Output(String name) {
		this.name = name;
		this.items = new ArrayList<Integer>();
		this.ws = new WorkSimulator(300, 50);
		this.log = new ConcurrencyValidator(1, 0, this.name);
	}
	
	public void receiveMeSomeItem(int item) throws InterruptedException {
		this.log.start("received itemId = " + item + " item");
		this.ws.work();
		this.items.add(item);
		this.log.end("item saved. There are " + this.items.size() + " items ready");
	}
}
