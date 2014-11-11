package com.resources;

import com.lac.annotations.Resource;
import com.utils.Giver;
import com.utils.Receiver;

@Resource
public class M2 implements Receiver, Giver {
	//We perform a kind of a singleton in order to obtain only one shared instance of this resource
	private static Machine machine = null;
	
	private Machine m;
	
	public M2(){
		if(M2.machine == null) {
			M2.machine = new Machine("M2");
		}
		this.m = M2.machine;
	}
	
	public void receiveMeSomeItem(int item) throws InterruptedException {
		this.m.receiveMeSomeItem(item);
	}
	
	public int giveMeSomeItem() throws InterruptedException {
		return this.m.giveMeSomeItem();
	}
	
	public void process() throws InterruptedException {
		this.m.process();
	}
}
