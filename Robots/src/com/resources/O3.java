package com.resources;

import com.utils.Receiver;

public class O3 implements Receiver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Output output = null;
	
	private Output o;
	
	public O3(){
		if(O3.output == null) {
			O3.output = new Output("O3");
		}
		this.o = O3.output;
	}
	
	public void receiveMeSomeItem(int item) throws InterruptedException {
		this.o.receiveMeSomeItem(item);
	}
}
