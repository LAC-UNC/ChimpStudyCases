package com.resources;

import com.utils.Giver;

public class I2 implements Giver {
	
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Input input = null;
	
	private Input i;
	
	public I2(){
		if(I2.input == null) {
			I2.input = new Input("I2");
		}
		this.i = I2.input;
	}
	
	public String giveMeSomeItem() throws InterruptedException {
		return i.giveMeSomeItem();
	}
}
