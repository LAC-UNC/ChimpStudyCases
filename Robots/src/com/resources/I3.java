package com.resources;

import com.utils.Giver;

public class I3 implements Giver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Input input = null;
	
	private Input i;
	
	public I3(){
		if(I3.input == null) {
			I3.input = new Input("I3");
		}
		this.i = I3.input;
	}
	
	public int giveMeSomeItem() throws InterruptedException {
		return i.giveMeSomeItem();
	}
}
