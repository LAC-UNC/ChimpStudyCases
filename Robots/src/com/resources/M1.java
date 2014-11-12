package com.resources;

import com.lac.annotations.Resource;
import com.utils.Giver;
import com.utils.Receiver;

@Resource
public class M1 implements Receiver, Giver {
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Machine machine = null;
	
	private Machine m;
	
	public M1(){
		if(M1.machine == null) {
			M1.machine = new Machine("M1");
		}
		this.m = M1.machine;
	}
	
	public void receiveMeSomeItem(String item) throws InterruptedException {
		this.m.receiveMeSomeItem(item);
	}
	
	public String giveMeSomeItem() throws InterruptedException {
		return this.m.giveMeSomeItem();
	}
	
	public void process() throws InterruptedException {
		this.m.process();
	}
}
