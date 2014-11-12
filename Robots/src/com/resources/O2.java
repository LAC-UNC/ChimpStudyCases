package com.resources;

import com.utils.Receiver;

public class O2 implements Receiver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Output output = null;
	
	private Output o;
	
	public O2(){
		if(O2.output == null) {
			O2.output = new Output("O2");
		}
		this.o = O2.output;
	}
	
	public void receiveMeSomeItem(String item) throws InterruptedException {
		this.o.receiveMeSomeItem(item);
	}
}
