package com.resources;

import java.util.ArrayList;

import com.utils.ConcurrencyValidator;
import com.utils.Giver;
import com.utils.Receiver;
import com.utils.WorkSimulator;

public class Machine implements Receiver, Giver{
	//Resource stuff
	private ArrayList<String> items = new ArrayList<String>();
	private String name;
	private int maxItems;
	private int minItems;
	
	//Simulators
	private WorkSimulator ws;
	private WorkSimulator lightws;
	
	//Concurrency controller and logger
	private ConcurrencyValidator log;
	
	public Machine(String name) {
		this.name = name;
		this.maxItems = 1;
		this.minItems = 0;
		this.ws = new WorkSimulator(3000, 1000);
		this.lightws = new WorkSimulator(30, 10);
		this.log = new ConcurrencyValidator(1,0,this.name);
	}
	
	private void printItemsAboveOfBounds() {
		System.out.println(this.name + " ---- ERROR ---- Items above of bound. items(" + this.maxItems + ") = " + this.items.size());
	}

	private void printItemsBelowOfBounds() {
		System.out.println(this.name + " ---- ERROR ---- Items below of bound. items(" + this.minItems + ") = " + this.items.size());
	}
	
	public void receiveMeSomeItem(String item) throws InterruptedException {
		this.log.start("putting item " + item + " in " + this.name);
		this.lightws.work();
		this.items.add(item);
		if(this.items.size() > this.maxItems) {
			this.printItemsAboveOfBounds();
		}
		this.log.end("item " + item + " in " + this.name);
	}
	
	public String giveMeSomeItem() throws InterruptedException {
		if(this.items.size() <= this.minItems) {
			this.printItemsBelowOfBounds();
			return "none";
		}
		
		String item = items.remove(0);
		this.log.start("taking item " + item + " from " + this.name);
		this.lightws.work();
		this.log.end("item " + item + " is not longer in " + this.name);
		return item;
	}
	
	public void process() throws InterruptedException {
		this.log.start("processing item " + this.items.get(0));
		this.ws.work();
		this.log.end("item " + this.items.get(0) + " is processed");
	}
}
