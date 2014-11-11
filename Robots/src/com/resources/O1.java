package com.resources;

import com.utils.Receiver;

public class O1 implements Receiver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Output output = null;
	
	private Output o;
	
	public O1(){
		if(O1.output == null) {
			O1.output = new Output("O1");
		}
		this.o = O1.output;
	}
	
	public void receiveMeSomeItem(int item) throws InterruptedException {
		this.o.receiveMeSomeItem(item);
	}
}
