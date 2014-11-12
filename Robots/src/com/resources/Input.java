package com.resources;

import com.utils.ConcurrencyValidator;
import com.utils.Giver;
import com.utils.WorkSimulator;

public class Input implements Giver {
	//Resource stuff
	private int item;
	private String name;
	
	//Simulators
	private WorkSimulator ws;
	
	//Concurrency controller and logger
	private ConcurrencyValidator log;
	
	public Input(String name) {
		this.name = name;
		this.ws = new WorkSimulator(300, 50);
		this.log = new ConcurrencyValidator(1, 0, this.name);
	}
	
	public String giveMeSomeItem() throws InterruptedException {
		int toRet;
		
		this.log.start("fetching new item");
		this.ws.work();
		toRet = this.item++;
		this.log.end("item fetched and ready. ItemId = " + this.name + '.' + toRet);
		return this.name + '.' + toRet;
	}
}
