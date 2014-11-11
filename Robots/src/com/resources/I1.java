package com.resources;

import com.utils.Giver;

public class I1 implements Giver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Input input = null;
	
	private Input i;
	
	public I1(){
		if(I1.input == null) {
			I1.input = new Input("I1");
		}
		this.i = I1.input;
	}
	
	public int giveMeSomeItem() throws InterruptedException {
		return i.giveMeSomeItem();
	}
}
