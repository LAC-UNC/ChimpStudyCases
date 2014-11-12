package com.resources;

import com.lac.annotations.Resource;
import com.utils.Giver;
import com.utils.Receiver;

@Resource
public class M4 implements Receiver, Giver {
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Machine machine = null;
	
	private Machine m;
	
	public M4(){
		if(M4.machine == null) {
			M4.machine = new Machine("M4");
		}
		this.m = M4.machine;
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
